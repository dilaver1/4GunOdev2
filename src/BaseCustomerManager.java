
public class BaseCustomerManager implements CustomerService {

    @Override
    public void save(Customer customer) {

        System.out.println("Veritabanina kaydedildi : " + customer.getFirstName());
    }

}
