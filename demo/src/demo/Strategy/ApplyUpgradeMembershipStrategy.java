package demo.Strategy;

import demo.Product;

public class ApplyUpgradeMembershipStrategy implements Strategy {

	@Override
	public void processRules(Product product) {
		System.out.println("Upgrade membership");
	}
	
}