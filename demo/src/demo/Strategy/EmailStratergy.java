package demo.Strategy;

import demo.Product;

public class EmailStratergy implements Strategy {

	@Override
	public void processRules(Product product) {
		System.out.println("Email Owner about purchase of " + product.getProductName());
	}
	
}
