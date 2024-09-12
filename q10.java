class Address {
    private int zipCode;

    public Address(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }
}

public class Customer {
    public Address address;
    public String name;

    public Customer(String name, int zipCode) {
        this.name = name;
        address = new Address(zipCode);
    }
}

public class q10 {
    public static void main(String[] args) {
        Customer customer = new Customer();

    }
}
