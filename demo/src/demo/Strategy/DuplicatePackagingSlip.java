package demo.Strategy;

import demo.Product;

public class DuplicatePackagingSlip implements Strategy {

	@Override
	public void processRules(Product product) {
		System.out.println("Create a duplicate packanging slip for royalty department");
	}
	
}

