package CollectionEX;

public class CollectionExample {
    public static void main(String[] args) {
        int cap = 11;
        int n = cap - 1;
        n |= n >>> 1;
        System.out.println(n);
    }
}
