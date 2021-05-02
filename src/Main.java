
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Dilaver");
        customer.setLastName("Agabeyov");
        customer.setDateOfBirth("2002.08.24");
        customer.setNationalId("1234");
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        BaseCustomerManager customerManager2=new NeroCustomerManager();
        customerManager.save(customer);//Starbucks icin (kontrollu)
        customerManager2.save(customer);//Nero icin (kontrolsuz)

    }

}
