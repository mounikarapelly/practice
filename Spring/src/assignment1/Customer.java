package assignment1;

public class Customer 
{
	
	private int CustomerId;
    private String CustomerName;
    private int CustomerContact;
    private Address CustomerAddress;
        public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		
		this.CustomerId = customerId;
		this.CustomerName = customerName;
		this.CustomerContact = customerContact;
		this.CustomerAddress = customerAddress;
	  }
	public int getCustomerId() {
			return CustomerId;
		}
		public String getCustomerName() {
			return CustomerName;
		}
		public int getCustomerContact() {
			return CustomerContact;
		}
		public Address getCustomerAddress() {
			return CustomerAddress;
		}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public void setCustomerContact(int customerContact) {
		CustomerContact = customerContact;
	}
	public void setCustomerAddress(Address customerAddress) {
		CustomerAddress = customerAddress;
	}
    public void displayInfo()
    {
    	System.out.println("customer detials===>name"+CustomerName+"ID"+CustomerId+"contact number"+CustomerContact);
    	System.out.println("Customer address:"+CustomerAddress);
    }
 
	
}
