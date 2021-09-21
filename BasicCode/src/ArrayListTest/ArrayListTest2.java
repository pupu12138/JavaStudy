package ArrayListTest;

import java.util.ArrayList;

/**
 * @author WYZ
 * @creat 2021-06-15 13:57
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
//      ArrayList<String> arr = new ArrayList();   <>进行类型限制
        ArrayList<String> arr = new ArrayList();
//        调用对象的add方法
//        arr.add(123);
        arr.add("111");
        arr.add("222");
        arr.add("333");
        arr.add("444");
//        arr.add(int index,element:"000");指定插入位置。
        arr.add(2,"000");

//        arr.add(true);
        System.out.println(arr);
    }
}
