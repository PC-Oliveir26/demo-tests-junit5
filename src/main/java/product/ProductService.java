package product;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

	@Autowired 
	private  ProductRepository productRepository;
	private ValidationService validationService;
	
	public void save (Product product) {
		if (this.validationService.canSave(product)) {
			this.productRepository.save(product);
		}
	}
	
	public void remove(Long id) throws SQLException {
		Optional<Product> productOptional = this.productRepository.findById(id);
			if(productOptional.isPresent()) {
				this.productRepository.deleteById(id);
			} else {
				throw new SQLException("product not registed or not found");
			}
	}
}
