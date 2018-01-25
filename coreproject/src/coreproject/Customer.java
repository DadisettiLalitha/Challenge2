package coreproject;

public class Customer {
	
	private String id;
	private String name;
	private long phoneno;
	private String address;
	
	public Customer(String id, String name, int phoneno, String address){
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneno=" + phoneno
				+ ", address=" + address + "]";
	}

	
}
