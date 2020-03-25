package murach.product;

public class ProductDB {

	public ProductDB() {
		int price;
		int amount;
		String location;
	}
	
    public static Product getProduct(String productCode) {
    	
    	
    		
    	
        Product product = new Product();

        // fill the Product object with data
        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            product.setDescription("Murach's Java Programming");
            product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
            product.setDescription("Murach's Java Servlets and JSP");
            product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            product.setDescription("Murach's MySQL");
            product.setPrice(54.50);
        } else if (productCode.equalsIgnoreCase("android")) {
        	product.setDescription("A cellular device");
        	product.setPrice(55.30);
        } else {
            product.setDescription("Unknown");
        }
        return product;
    }
}
