package GenericsEX;

public class HelloWorld2<T> {
    private T t;

    public T getValue() {
        return t;
    }

    public void setValue(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        System.out.println("泛型类");
        HelloWorld2<String> helloWorld2 = new HelloWorld2<String>();
        helloWorld2.setValue("ads");
        System.out.println(helloWorld2.getValue());


        System.out.println("泛型方法");
        func1("2131");
        func1(213123);

        System.out.println("泛型接口");
        Myclass myclass = new Myclass();
        myclass.print1(123123);

    }


    static <T> void func1(T t) {
        System.out.println(t);
    }


    interface impl1<T extends Number> {
        void print1(T t);
    }

    static class Myclass implements impl1 {
        @Override
        public void print1(Number number) {
            System.out.println(number);
        }
    }


}
