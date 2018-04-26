package container;

import java.util.*;

public class ListTest {

    public static void testFor(List list) {
        Object temp;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
        }
    }

    public static void testForEach(List list) {
        Object temp;
        for(Object t : list){
            temp = t;
        }
    }

    public static void testIterator(List list) {
        Object temp;
        for(Iterator<Object> it = list.iterator(); it.hasNext();){
            temp = it.next();
        }
    }

    public static void main(String[] args) {

        /*
            1、增强型for循环本质为迭代
            2、ArrayList for循环比迭代速度快
            3、LinkedList for巨慢，遍历应使用迭代
            4、LinkedList 所谓的增删快是针对随机，有序时ArrayList的效率高
         */

        List al = new ArrayList();
        List ll = new LinkedList();

        Object o = new Object();
        Long t = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
//            al.add(o);
            ll.add(o);
        }

        Long t0 = System.currentTimeMillis();
//        testFor(al);
        testFor(ll);
        Long t1 = System.currentTimeMillis();
//        testForEach(al);
        testForEach(ll);
        Long t2 = System.currentTimeMillis();
//        testIterator(al);
        testIterator(ll);
        Long t3 = System.currentTimeMillis();

        System.out.println(t0-t);
        System.out.println(t1-t0);
        System.out.println(t2-t1);
        System.out.println(t3-t2);

    }
}
