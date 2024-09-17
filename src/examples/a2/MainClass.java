package examples.a2;

public class MainClass {
	public static void main(String[] args) {
      Customer myCustomer = new Customer();
      myCustomer.setName("john");
      myCustomer.setCity("japan");
      myCustomer.setAge(26);
      myCustomer.setMobile(8759566555L);
      System.out.println(myCustomer.getName());
      System.out.println(myCustomer.getCity());
      System.out.println(myCustomer.getAge());
      System.out.println(myCustomer.getMobile());
	}
}

