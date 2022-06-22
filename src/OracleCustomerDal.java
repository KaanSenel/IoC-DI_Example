public class OracleCustomerDal implements CustomerDal{

    private String connStr;

    public String getConnStr() {
        return connStr;
    }

    public void setConnStr(String connStr) {
        this.connStr = connStr;
    }
    @Override
    public void add(Customer customer) {
        System.out.println("Bağlantı : "+this.getConnStr());
        System.out.println("Oracle veritabanına eklendi."+customer.getName());
    }
}
