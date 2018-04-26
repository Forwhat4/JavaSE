package inner;

public class Outer {

    private int a = 1;
    private static int b = 2;

    {
        System.out.println("outer");
    }

    public void say(){
        System.out.println("hello");
    }

    public static void speak(){
        System.out.println("say something");
    }

    //普通内部类
    public class GeneralInner{

        {
            System.out.println("GeneralInner");
        }


        public void getOM(){
            say();
            speak();
        }
    }

    //静态内部类
    public static class StaticInner{

        {
            System.out.println("StaticInner");
        }

    }

    //局部内部类
    public void method(final int c){
        final int d = 4;

        class MethodInner{
            {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);

            }
        }
    }

    public static void main(String[] args){
        Outer o = new Outer();

        //创建普通内部类对象 Outer.Inner innerObj = outerObj.new Inner() OR Outer.Inner innerObj = new Outer.new Inner()
        //Outer.GeneralInner gi1 = o.new GeneralInner();
        //Outer.GeneralInner gi2 = new Outer().new GeneralInner();

        //gi1.getOM();

        Outer.StaticInner si = new StaticInner();
    }
}
