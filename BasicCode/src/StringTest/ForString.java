package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-05 21:25
 * ����¼��һ���ַ�����ʵ�ó���ʵ�ֱ����ַ���
 * ʹ��charAtʵ�ֱ���
 */
public class ForString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ַ���");
        String line = sc.nextLine();

        for (int i = 0; i <line.length() ; i++) {
            System.out.println(line.charAt(i));
        }
    }
}
