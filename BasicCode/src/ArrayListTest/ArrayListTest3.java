package ArrayListTest;

import java.util.ArrayList;

/**
 * @author WYZ
 * @creat 2021-06-16 14:36
 * public boolean remove(Object o) 删除指定的元素，返回删除是否成功
 * public E remove(int index) 删除指定索引处的元素，返回被删除的元素
 * public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
 * public E get(int index) 返回指定索引处的元素
 * public int size() 返回集合中的元素的个数
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

//      public int size() 返回集合中的元素的个数
        int size = list.size();
        System.out.println(size);
    }

    private static void getTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
//        public E get(int index) 返回指定索引处的元素
        String s = list.get(0);
//        String s1 = list.get(111);
//        索引越界
        System.out.println(s);
        System.out.println(list);
    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
//        public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
        String set1 = list.set(0, "000");
        System.out.println(list);
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
//      public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        boolean remove1 = list.remove("111");

        boolean remove2 = list.remove("aaa");


        System.out.println(remove1);
        System.out.println(remove2);

        System.out.println(list);
//      public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        String remove3 = list.remove(3);
//        一般不接收
        System.out.println(list);
    }
}
