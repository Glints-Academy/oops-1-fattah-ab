package assesment1;

public class Person {
	private String name;
	private String address;
	
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		 return name + "(" + address + ")";
		 }
	
	public void introduce() {
		System.out.println("Hello I am " + name + " I am from " + address);
	}
}
