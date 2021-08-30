package com.curso.bank;

import java.util.HashMap;
import java.util.Map;

public class BankMap {
  private static Map<String,Customer> customers;

  static {
    customers = new HashMap<String, Customer>();
  }

  private BankMap() {
    // this constructor should never be called
  }

  public static void addCustomer(String f, String l, String dni) {
	  customers.put(dni, new Customer(f, l));  
  }
  
  public static void addCustomer(Customer c, String dni) {
	  customers.put(dni, c);  
  }
  

  public static int getNumOfCustomers() {
    return customers.size();
  }
  
  public static Customer getCustomer(String dni) {
    return customers.get(dni);
  }
}
