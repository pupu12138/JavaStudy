package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 22:14
 * �������� :
 * ����¼��һ�� �ַ���������ַ����а�����TMD������ʹ��***�滻
 * ʵ�ֲ��� :
 * 1. ����¼��һ���ַ������� Scanner ʵ��
 * 2. �滻���д�
 *  String replace(CharSequence target, CharSequence replacement)
 *  ����ǰ�ַ����е�target���ݣ�ʹ��replacement�����滻�������µ��ַ���
 * 3. ������
 */
public class ChangeString {
    public static void main(String[] args) {
        System.out.println("�������ַ���");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String result = line.replace("TMD","***");
        System.out.println(result);
    }
}
