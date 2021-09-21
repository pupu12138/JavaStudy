package ArrayListTest;

import java.util.ArrayList;

/**
 * @author WYZ
 * @creat 2021-06-16 16:53
 */
public class deleteArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
//          System.out.println(s);
            if("test".equals(s)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
