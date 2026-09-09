package productTest;

import java.math.BigDecimal;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import product.Product;
import product.ProductRepository;
import product.ProductService;

@SpringBootTest
@SpringBootApplication
public class ProductServiceTest {
	
	private ProductService productService;
	private ProductRepository productRepository;

	@Test
	public void shouldSavedTheProducto() {
		Product product = new Product("computer", new BigDecimal(2000), "PAGO");

		this.productService.save(product);
		
		int size = this.productRepository.findAll().size();
		String name = this.productRepository.findById(1L).get().getName();
		
		Assertions.assertEquals(1, size);
		Assertions.assertEquals("computer", name, "no equals, expect:'computer'");

	}
	
	@Test
	public void shouldThrowExceptionWhenRemoveANonExistentProduct() {
		Assertions.assertThrows(SQLException.class, () -> this.productService.remove(2L));
	}
}
