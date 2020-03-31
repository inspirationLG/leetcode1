package GenericsEX;

public class HelloWorld1<T> {

    private T t;
    public T getValue() {
        return t;
    }

    public void setValue(T t) {
        this.t = t;
    }


    public static void main(String[] args) {
        System.out.println("泛型类示例");
        HelloWorld<String> helloWorld = new HelloWorld<String>();
        helloWorld.setValue("love");
        System.out.println(helloWorld.getValue());

        System.out.println("泛型方法");
        prt("saasdasd");
        prt(1231);

        //泛型接口
        Myhello myhello = new Myhello();
        myhello.print("2131");
//        myhello.print(2131);
    }

    //泛型方法
    static <T> void prt(T t) {
        System.out.println(t);
    }


    interface Myinterface <T extends String> {
        void print(T t);
    }

    static  class Myhello implements Myinterface {
        @Override
        public void print(String s) {
            System.out.println(s);

        }
    }


}
