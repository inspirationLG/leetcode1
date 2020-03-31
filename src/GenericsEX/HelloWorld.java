package GenericsEX;

import org.apache.log4j.Logger;

/*
泛型类示例
*/


public class HelloWorld<T> {
//        private final static Logger LOGGER = Logger.getLogger(HelloWorld.class);

        private T t;

        public T getValue() {
                return t;
        }

        public void setValue(T t) {
                this.t = t;
        }

        public static void main(String[] args) {
                System.out.println("泛型类示例");
                //泛型类示例
                HelloWorld<String> helloWorld = new HelloWorld<String>();
                helloWorld.setValue("helloworld");
                //IDE提供的类型检查只能设置String类型的对象，Long类型报错
                System.out.println(helloWorld.getValue());

                HelloWorld<Long> helloWorld1 = new HelloWorld<Long>();
                helloWorld1.setValue(5211314L);
                //IDE提供的类型检查只能设置Long类型的对象，String类型报错
                System.out.println(helloWorld1.getValue() + "\n");

                System.out.println("泛型方法实例");
                printHelloWorld("hello world");
                printHelloWorld(5211315 + "\n");

                System.out.println("泛型接口实例");
                //泛型接口实例
                MyInterface myhelloworld = new MyHelloworld();
                //Number类型都可以
                myhelloworld.print(5211314L);
                myhelloworld.print(521);
                //String类型不可以
        }


        //泛型方法
        static <T> void printHelloWorld(T t) {
                System.out.println(t);
        }


        //泛型接口
        interface MyInterface<T extends Number> {
                void print(T t);
        }

        static class MyHelloworld implements MyInterface {
                @Override
                public void print(Number number) {
                        System.out.println(number);
                }
        }

}
