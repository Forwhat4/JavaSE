package inner;

public class Outer {

    private int a = 1;
    private static int b = 2;

    public void say(){
        System.out.println("hello");
    }

    public static void speak(){
        System.out.println("say something");
    }

    //普通内部类
    public class GeneralInner{

        public void getOM(){
            say();
            speak();
        }
    }

    //静态内部类
    public static class StaticInner{

    }

    //局部内部类
    public void method(){
        class MethodInner{

        }
    }

    public static void main(String[] args){
        Outer o = new Outer();

        //创建普通内部类对象 Outer.Inner innerObj = outerObj.new Inner() OR Outer.Inner innerObj = new Outer.new Inner()
        Outer.GeneralInner gi1 = o.new GeneralInner();
        Outer.GeneralInner gi2 = new Outer().new GeneralInner();

        gi1.getOM();


    }
}
