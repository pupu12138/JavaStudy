package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 17:27
 * ����һ��������ʵ���ַ����ķ�ת������¼��һ���ַ��������ø÷������ڿ���̨������
 * ����abc ��� cba
 */
public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ַ���");

        String line = sc.nextLine();
        String s = SwitchString(line);
        System.out.println(s);

    }
//    ����һ������
    /*
    ������ȷ
        ��ȷ����ֵ���ͣ�string
        ������string
     */

    public static String SwitchString(String s) {
        String ss = "";
//        ��������ַ���
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }

        return ss;
    }
}
