package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-06 21:14
 * ����¼��һ���ַ�����ͳ�Ƹ��ַ����д�дд��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���
 */
public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ַ���");
        String line = sc.nextLine();
//        ͳ���ַ�������Ҫ��������ͳ�Ʊ�������ʼֵΪ0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
//        ����
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
//            ��ÿһ���ַ�����ch
//            �ж�����
            if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("��д�ַ�" + bigCount);
        System.out.println("Сд�ַ�" + smallCount);
        System.out.println("�����ַ�" + numberCount);
    }
}
