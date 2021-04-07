package src;

public class Data<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class DataRunner {
    public static void main(String[] args) {
        Data<String> d1 = new Data();
        d1.setData("jason balladares");
        System.out.println(d1.getData());
    }
}