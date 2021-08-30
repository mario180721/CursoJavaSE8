package com.curso.bank;

import java.util.*;

public class CustomerList {

  private String firstName;

  private String lastName;

  private List<Account> accounts;


  public CustomerList(String f, String l) {
    firstName = f;
    lastName = l;
    // initialize accounts array
    accounts = new ArrayList<Account>();
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
