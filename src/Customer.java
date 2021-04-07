package src;

import java.io.Serializable;

class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String custId;
    private String name;
    private String address;
    private String phno;
    private static int customerCount;

    public Customer(String name, String address, String phno) {
        this.custId = "C" + customerCount;
        this.address = name;
        setAddress(address);
        setPhno(phno);
        customerCount++;
    }

    public Customer() {
        customerCount++;
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    @Override
    public String toString() {
        return "Customer [address=" + address + ", custId=" + custId + ", name=" + name + ", phno=" + phno + "]";
    }

    public static void main(String[] args) {
        Customer c0 = new Customer("jsonballadares", "14815 sw 71st ter", "7867201701");
        System.out.println(c0);
    }

}
