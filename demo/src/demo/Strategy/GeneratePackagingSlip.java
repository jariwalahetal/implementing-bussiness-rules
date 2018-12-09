package demo.Strategy;

import demo.Product;

public class GeneratePackagingSlip implements Strategy {

	@Override
	public void processRules(Product product) {
		System.out.println("Generate packaging slip");
	}
	
}
