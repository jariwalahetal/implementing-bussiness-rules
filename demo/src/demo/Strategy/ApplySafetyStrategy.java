package demo.Strategy;

import demo.Product;

public class ApplySafetyStrategy implements Strategy {

	@Override
	public void processRules(Product product) {
		if(product.getProductName().equals("Learning to Ski")) {
			System.out.println("Add free First aid video to packing slip");
		}
	}
	
}
