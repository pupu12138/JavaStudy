package ArrayListTest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-16 16:00
 * �������� :
 * ����һ���洢�ַ����ļ��ϣ��洢3���ַ���Ԫ�أ�ʹ�ó���ʵ���ڿ���̨�����ü���
 * ʵ�ֲ��� :
 * 1:�������϶���
 * 2:������������ַ�������
 * 3:�������ϣ�����Ҫ�ܹ���ȡ�������е�ÿһ��Ԫ�أ����ͨ��get(int index)����ʵ��
 * 4:�������ϣ����Ҫ�ܹ���ȡ�����ϵĳ��ȣ����ͨ��size()����ʵ��
 * 5:�������ϵ�ͨ�ø�ʽ
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
