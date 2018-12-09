package demo.Strategy;

import demo.Product;

public class GenerateCommissionStratergy  implements Strategy {

	@Override
	public void processRules(Product product) {
		System.out.println("Generate commission for product - " + product.getProductName());
	}
	
}
