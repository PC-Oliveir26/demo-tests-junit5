package product;

public class ValidationService {

	public boolean canSave(Product product) {
		
		return "PAGO".equals(product.getStatus());
	}

}
