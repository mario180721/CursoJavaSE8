package com.curso.bank;

public class TestBankMap {
	
	public static void main(String[] args) {
		
		Customer customer;
	    Account  account;
	    
	    // Create two customers and their accounts
	    BankMap.addCustomer("Jane",  "Pardo","A2222");
	    customer = BankMap.getCustomer("A2222");
	    customer.addAccount(new SavingsAccount(500.00, 0.05));
	    customer.addAccount(new CheckingAccount(200.00, 500.00));
	    BankMap.addCustomer("Owen", "Bryant","Y1111");
	    customer = BankMap.getCustomer("Y1111");
	    customer.addAccount(new SavingsAccount(200.00, 0.03));
	    
	    // Test the checking account of Jane Simms (with overdraft protection)
	    customer = BankMap.getCustomer("A2222");
	    account = customer.getAccount(1);
	    System.out.println("Customer [" + customer.getLastName()
	    + ", " + customer.getFirstName() + "]"
	            + " has a checking balance of "
	            + account.getBalance()
	            + " with a 500.00 overdraft protection.");
	    
	    
	    

	}
	
}
