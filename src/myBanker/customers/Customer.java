/**
 * 
 */
package myBanker;

/**
 * @author Theral
 *
 */
public class Customer {
	private String customerID;
	private String customerName;
	private boolean active;
	
	/**
	 * Default constructor
	 * 
	 */
	public Customer() {
		
	}
	
	/** customer constructor non-default<br<br>
	 * 
	 * @param id the customer ID
	 * @param name the customer name
	 * 
	 * and set the active status to false<br>
	 */
	public Customer(String id, String name) {
		this.customerID = id;
		this.customerName = name;
		this.active = false;
		
	}
	
	/** customer constructor for loading the individual data from the database<br><br>
	 * 
	 * 
	 * @param id the customer ID
	 * @param name the customer name
	 * @param active this sets the status of the customer
	 * 
	 */
	public Customer(String id, String name, boolean active) {
		
	}

	
	// get
	
	/**
	 * 
	 * @return the cusomerID
	 */
	public String getCustomerId() {
		return this.customerID;
	}
	/**
	 * 
	 * @return the customerName
	 */
	public String getCustomerName() {
		return this.customerName;
	}
	
	/**
	 * 
	 * @return whether the customer is an active customer
	 */
	public boolean getActive() {
		return this.active;
	}
	
	// set
	
	/**
	 * 
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	/**
	 * 
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/**
	 * 
	 * @param active the active to set
	 */
	public void setActivr(boolean active) {
		this.active = active;
	}
	
	public String toString() {
		return String.format("%-10s \t %-40s \t\t %s", this.customerID, this.customerName, ((this.active)? "Active" : "Inactive"));
	}
}
