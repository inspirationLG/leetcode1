package duotai;

import java.util.ArrayList;

public class demo4 {
    public static void main(String[] args) {
        Stu1 B=new Stu1();
        People C=new Stu2();
        People D=new Stu3();
        System.out.println(solve(B));
        System.out.println(solve(C));
        System.out.println(solve(D));
    }
    public static String solve(People a) {
        if (a instanceof Stu1) { //

        }
        return a.type;
    }

}

class People{
    String type="people";
    public void eat(){
        System.out.println("吃饭");
    }
}
class Stu1 extends People{
    Stu1() {
        this.type = "黄种人";
    }
    @Override
    public void eat(){
        System.out.println("I am A");
    }
    public void study(){
        System.out.println("A不学习");
    }
}
class Stu2 extends People{
    Stu2() {
        this.type = "白种人";
    }
    @Override
    public void eat(){
        System.out.println("I am B");
    }
    public void study(){
        System.out.println("好好学习");
    }
}
class Stu3 extends People{
    Stu3() {
        this.type = "黄种人";
    }
    @Override
    public void eat(){
        System.out.println("I am C");
    }
    public void study(){
        System.out.println("好好学习");
    }
}
class Teachers extends People{
    @Override
    public void eat(){
        System.out.println("吃樱桃");
    }
    public void teach(){
        System.out.println("认真授课");
    }
}