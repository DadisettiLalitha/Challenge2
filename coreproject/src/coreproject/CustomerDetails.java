package coreproject;

import java.util.HashMap;
import java.util.Set;


public class CustomerDetails {

	public static void main(String args[]){
		
		HashMap<String,Customer> cstdetails = new HashMap<String, Customer>();
				
			cstdetails.put("1",new Customer("101","java",876765,"NC"));
			cstdetails.put("2",new Customer("102","j2ee",453765,"IN"));
			cstdetails.put("3",new Customer("103","spring",8765365,"NT"));
			cstdetails.put("4",new Customer("104","hibernate",9196765,"MA"));
			displayDetails(cstdetails);
	}

	private static void displayDetails(HashMap<String, Customer> custByKey) {
			
			 Set<String> key = custByKey.keySet();
			 for(String c : key){
				 System.out.println(c+"----"+custByKey.get(c));
			 }
	}
}
