package examples.a2;

public class Customer {
	/*
	 * Create a customer class In customer class create 3 instance variables namely:
	 * 1. name of type string 2. city of type string 3. age of type int 4. mobile of
	 * type long Make sure you achieve encapsulation create 2 objects in main method
	 * of main class and give values and show values in sysout
	 */
	private String name;
	private String city;
	private int age;
	private long mobile;

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	public int getAge() {
		return this.age;
	}

	public long getMobile() {
		return this.mobile;
	}

}
