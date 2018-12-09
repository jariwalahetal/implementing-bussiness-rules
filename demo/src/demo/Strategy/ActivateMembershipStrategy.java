package demo.Strategy;

import demo.Product;

public class ActivateMembershipStrategy implements Strategy {

	@Override
	public void processRules(Product product) {
		System.out.println("Payment is for membership. So activate membership");
	}
	
}
