package com.curso.bank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class CustomerList {

  private String firstName;
  
  private LocalDate fechaAlta;

  private String lastName;

  private List<Account> accounts;


  public CustomerList(String f, String l) {
    firstName = f;
    lastName = l;
    // initialize accounts array
    accounts = new ArrayList<Account>();
    this.fechaAlta=LocalDate.now();
  }
  
  
  public CustomerList(String f, String l,LocalDate fechaAlta) {
	   this(f, l);
	   this.fechaAlta=fechaAlta;
	  }
  
  

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void addAccount(Account acct) {
    accounts.add(acct);
  }

  public int getNumOfAccounts() {
    return accounts.size();
  }

  public Account getAccount(int account_index) {
    return accounts.get(account_index);
  }
}
