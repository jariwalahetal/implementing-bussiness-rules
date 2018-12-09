package demo;

import java.util.ArrayList;

import demo.Strategy.*;

public class Product {
	
	private String productName;
	private String productType;
	private ArrayList<Strategy> productStrategy = new ArrayList<>();
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String pName) {
		productName = pName;
	}
	
	public String getProductType() {
		return productType;
	}
	
	public void setProductType(String pType) {
		productType = pType;
		productStrategy.clear();
		if(pType.equals("Physical Product")) {
			this.productStrategy.add(new GeneratePackagingSlip());
			this.productStrategy.add(new GenerateCommissionStratergy());			
		}
		else if(pType.equals("Book")) {
			this.productStrategy.add(new GeneratePackagingSlip());
			this.productStrategy.add(new DuplicatePackagingSlip());
			this.productStrategy.add(new GenerateCommissionStratergy());
			
		}
		else if(pType.equals("New Membership")) {
			this.productStrategy.add(new ActivateMembershipStrategy());
			this.productStrategy.add(new EmailStratergy());
		}
		else if(pType.equals("Upgrade Membership")) {
			this.productStrategy.add(new ApplyUpgradeMembershipStrategy());
			this.productStrategy.add(new EmailStratergy());
		}
		else if(pType.equals("Video")) {
			this.productStrategy.add(new ApplySafetyStrategy());
		}
	}
	
	public void Buy() {
		System.out.println("---------------------------------------------");
		System.out.println(productName + " is purchased");
		for(Strategy s: productStrategy) {
			s.processRules(this);
		}
		System.out.println("---------------------------------------------\n");
	}
}
