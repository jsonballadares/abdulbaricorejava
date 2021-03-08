package src;

interface Member {
    public void callback();
}

class Store {
    Member members[] = new Member[10];
    int count = 0;

    void register(Member m) {
        members[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++)
            members[i].callback();
    }

}

class Customer1 implements Member {
    String name;

    Customer1(String n) {
        name = n;
    }

    public void callback() {
        System.out.println("Ok, I will visit," + name);

    }

}

public class SCInterface1 {

    public static void main(String[] args) {
        Store s = new Store();
        Customer1 c1 = new Customer1("John");
        Customer1 c2 = new Customer1("Smith");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }

}