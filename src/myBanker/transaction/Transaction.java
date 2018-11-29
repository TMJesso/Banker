/**
 * 
 */
package myBanker.transaction;


/**
 * @author Theral
 *
 */
public class Transaction {
	private java.util.Date createDate;
	private String customerID;
	private String accountNumber;
	private String description;
	private double amount;
	private long transactionNumber;

	/** default constructor
	 * 
	 */
	public Transaction() {
	}
	
	/** transaction constructor<br><br>
	 * 
	 * this is for the account transactions<br>
	 * 
	 * @param createDate java.util.Date
	 * @param customerID from the Customer
	 * @param accountNumber from the Account
	 * @param description a description of the transaction (Deposit, Withdraw, EOF calculations, etc.)
	 * @param amount of the transaction
	 * @param transactionNumber a unique transaction number
	 */
	public Transaction(java.util.Date createDate, String customerID,
			String accountNumber, String description, double amount,
			long transactionNumber) {
		this.createDate = createDate;
		this.customerID = customerID;
		this.accountNumber = accountNumber;
		this.description = description;
		this.amount = amount;
		this.transactionNumber = transactionNumber;
	}
	
	/** transaction constructor<br><br>
	 * 
	 * this is for the customer transactions<br>
	 *  
	 * @param createDate java.util.Date
	 * @param customerID from the Customer
	 * @param description a description of the transaction (Deposit, Withdraw, EOM calculation, etc.)
	 * @param transactionNumber
	 */
	public Transaction(java.util.Date createDate, 
			String customerID, String description, 
			long transactionNumber) {
		this.createDate = createDate;
		this.customerID = customerID;
		this.accountNumber = "No Accounts";
		this.description = description;
		this.amount = 0.00;
		this.transactionNumber = transactionNumber;
	}

	// GET
	
	/**
	 * 
	 * @return the createDate
	 */
	public java.util.Date getCreateDate() {
		return this.createDate;
	}
	
	/**
	 * 
	 * @return the customerID
	 */
	public String getCustomerID() {
		return this.customerID;
	}
	
	/**
	 * 
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * 
	 * @return the amount
	 */
	public double getAmount() {
		return this.amount;
	}
	
	/** 
	 * 
	 * @return the transactionNumber
	 */
	public long getTransactionNumber() {
		return this.transactionNumber;
	}
	
	// SET
	
	/**
	 * 
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	
	/**
	 * 
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	/**
	 * 
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * 
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	/**
	 * 
	 * @param transactionNumber the transactionNumber to set
	 */
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	
	
	public String toString() {
		return String.format("%d \t %s \t %s \t %s \t %s \t\t $%12.2f \n", 
				this.transactionNumber, this.createDate, this.customerID,
				this.accountNumber, this.description, this.amount);
	}
	
	
	
	
}
