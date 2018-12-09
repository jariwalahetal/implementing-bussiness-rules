package demo;

public class Runner {

	public static void main(String[] args) {
		
		Product physicalProduct = new Product();
		physicalProduct.setProductName("Laptop");
		physicalProduct.setProductType("Physical Product");
		physicalProduct.Buy();
		
		Product book = new Product();
		book.setProductName("Learn to program in JAVA");
		book.setProductType("Book");
		book.Buy();
		
		Product membership = new Product();
		membership.setProductName("1 Year new membership");
		membership.setProductType("New Membership");
		membership.Buy();
		
		Product upgardeMembership = new Product();
		upgardeMembership.setProductName("Upgrade Membership");
		upgardeMembership.setProductType("Upgrade Membership");
		upgardeMembership.Buy();

		Product videoForSki = new Product();
		videoForSki.setProductName("Learning to Ski");
		videoForSki.setProductType("Video");
		videoForSki.Buy();
		
		Product videoForJava = new Product();
		videoForJava.setProductName("Learn to skate");
		videoForJava.setProductType("Video");
		videoForJava.Buy();
	}

}
