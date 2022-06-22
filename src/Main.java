import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //iç içe injection varsa context kısmında ref verilir.
        CustomerService customerService=context.getBean("manager",CustomerService.class);

        Customer customer=new Customer(1,"kaan",23);

        customerService.add(customer);

    }
}
