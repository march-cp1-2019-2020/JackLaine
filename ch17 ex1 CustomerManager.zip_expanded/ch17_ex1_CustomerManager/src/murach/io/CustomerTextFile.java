package murach.io;


import java.util.*;
import java.io.*;
import java.nio.file.*;
import murach.business.Customer;
//Jack Laine
public class CustomerTextFile {
    private static final String FIELD_SEP = "\t";
    private static final Path customersPath = Paths.get("products.txt");     
    private static final File customersFile = customersPath.toFile();      
    private static ArrayList<Customer> customers = null; 
    
    // prevent instantiation of the class
    private CustomerTextFile() {}

    public static List<Customer> getCustomers() {
       try (PrintWriter out = new PrintWriter(
    		   				  new BufferedWriter
    		   				  new FileWriter(customers.txt)))){
    	for (customers c : customers) {
    		out.print(c.getCode() + FIELD_SEP);
    		out.print(c.getDescription() + FIELD_SEP);
    		out.println(c.getPrice());
    	}
    		   				  }
    	if (customers != null)
            return customers;        

        customers = new ArrayList<>();  
        String line = in.readLine();
        while(line !=null) {
        	String[] columns = line.split(FIELD_SEP);
        	String code = columns[0];
        	String description = columns[1];
        	String price = columns[2];
        	
        	Customer c = new Customer();
        	c.setCode(code);
        	c.setDescription(description);
        	c.setPrice(Double.parseDouble(price));
            //TEACHER NOTES: this next line should be customers.add(c)
        	Customer.add(c);
        }
        
        


        return customers;            
    }

    public static Customer getCustomer(String email) {
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    public static boolean addCustomer(Customer c) {
        customers.add(c);
        return saveCustomers();
    }

    public static boolean deleteCustomer(Customer c) {
        customers.remove(c);
        return saveCustomers();
    }

    public static boolean updateCustomer(Customer newCustomer) {
        // get the old customer and remove it
        Customer oldCustomer = getCustomer(newCustomer.getEmail());
        int i = customers.indexOf(oldCustomer);
        customers.remove(i);

        // add the updated customer
        customers.add(i, newCustomer);

        return saveCustomers();
    }

    private static boolean saveCustomers() {
    	fileWriter(customers.txt){
    	//TEACHER NOTES: you must get each attribute of the Customer class as a string and then print it one at a time to the file.
    	out.print(get.customers); 
        return true;
        //TEACHER NOTES: a try/catch block must go around the code not after it.
        try {
    } catch (IOException e) {
    System.out.println("error occured");
        		
    }
}
}
}
