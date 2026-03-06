package src1.test1;

public class Address {

	Boolean isPerment;
	String address;
	public Address(Boolean isPerment, String address) {
		super();
		this.isPerment = isPerment;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [isPerment=" + isPerment + ", address=" + address + "]";
	}
	public Boolean getIsPerment() {
		return isPerment;
	}
	public void setIsPerment(Boolean isPerment) {
		this.isPerment = isPerment;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
