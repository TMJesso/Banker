/**
 * 
 */
package myBanker.account;


import myBanker.Customer;
import myBanker.transaction.*;;


/**
 * @author Theral
 * November 27, 2018
 * 
 * 
 */
public abstract class Account {
	private String accountNumber;
	private double accountBalance;
	
	private Customer customer;
	private Transaction transaction;
	
	
	
	/** default constructor<br><br>
	 * 
	 */
	public Account() {
	}

	/** account constructor<br><br>
	 * 
	 * this will add the account and customer to the account table<br>
	 * and set the active status of the customer to true<br><br>
	 * 
	 * @param accountNumber the account number of the account
	 * @param accountBalance the opening balance of the account
	 * @param customer the owner of the account
	 * @param transaction
	 */
	public Account(String accountNumber, double accountBalance, Customer customer, Transaction transaction){
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customer = customer;
	}

	// get
	
	/**
	 * ]
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * 
	 * @return the accountBalance
	 */
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	/**
	 * 
	 * @return the customer
	 */
	public Customer getCustomer() {
		return this.customer;
	}
	
	/**
	 * 
	 * @return the transaction
	 */
	public Transaction getTransaction() {
		return this.transaction;
	}
	
	// set
	
	/**
	 * 
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * 
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	/**
	 * 
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * 
	 * @param transaction the transaction to set
	 */
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	abstract public boolean makeDeposit(double amount);
	
	abstract public double makeWithdrawal(double amount);
	
}
