package ArrayListTest;

import java.util.ArrayList;

/**
 * @author WYZ
 * @creat 2021-06-16 14:36
 * public boolean remove(Object o) ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
 * public E remove(int index) ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
 * public E set(int index,E element) �޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
 * public E get(int index) ����ָ����������Ԫ��
 * public int size() ���ؼ����е�Ԫ�صĸ���
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

//      public int size() ���ؼ����е�Ԫ�صĸ���
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
//        public E get(int index) ����ָ����������Ԫ��
        String s = list.get(0);
//        String s1 = list.get(111);
//        ����Խ��
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
//        public E set(int index,E element) �޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
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
//      public boolean remove(Object o)��ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
        boolean remove1 = list.remove("111");

        boolean remove2 = list.remove("aaa");


        System.out.println(remove1);
        System.out.println(remove2);

        System.out.println(list);
//      public E remove(int index)��ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
        String remove3 = list.remove(3);
//        һ�㲻����
        System.out.println(list);
    }
}
