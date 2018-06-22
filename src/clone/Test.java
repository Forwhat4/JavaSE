package clone;

public class Test {

    public static void main(String[] args) {

        try{
            Person p = new Person("lisi",22,"male");

            Person pc = (Person) p.clone();

            //clone为浅拷贝，两个对象的name指向同一个String对象
            System.out.println(p.getName() == pc.getName());

            pc.setName("zhangsan");
            System.out.println(p.getName() == pc.getName());

            System.out.println(p+"<--->"+pc);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
