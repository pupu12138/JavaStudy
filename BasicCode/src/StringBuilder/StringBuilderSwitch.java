package StringBuilder;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-15 9:21
 * ����һ������ʵ���ַ����ķ�ת�����������ַ�������ת�����
 * ���磺����abc���cba
 * ����һ��������ʵ���ַ����ķ�ת ����ֵString ����string s
 * �ڷ�����ʹ��stringBuilderʵ���ַ�����ת�����ѽ��ת��string����
 * ���÷��� ��һ��������������
 * ������
 */
public class StringBuilderSwitch {
    public static void main(String[] args) {
        System.out.println("�����룺");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s = switchString(line);
        System.out.println(s);
    }
    public static  String switchString(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String s1 = sb.toString();
//        return s1;
        return new StringBuilder(s).reverse().toString();
    }
}
