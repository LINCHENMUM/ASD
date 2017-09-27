package AbstractFactory;

public class Order {
	String customerType;
	String packType;
	
	public Order(String customerType, String packType) {
		//super();
		this.customerType = customerType;
		this.packType = packType;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	

}
