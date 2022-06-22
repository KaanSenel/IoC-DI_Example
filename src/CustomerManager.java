public class CustomerManager implements CustomerService {

    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    //setter injection
    public void setCustomerDal(CustomerDal customerDal){
        this.customerDal=customerDal;
    }

    @Override
    public void add(Customer customer) {
        this.customerDal.add(customer);
    }
}