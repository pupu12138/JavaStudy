package ArrayListTest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-16 16:00
 * 案例需求 :
 * 创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
 * 实现步骤 :
 * 1:创建集合对象
 * 2:往集合中添加字符串对象
 * 3:遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
 * 4:遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
 * 5:遍历集合的通用格式
 */
public class forArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
