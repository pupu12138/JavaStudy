package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 22:07
 * ���ַ�������ʽ�Ӽ��̽���һ���ֻ��ţ����м���λ�������� ����Ч��Ϊ��1561234
 * ʵ�ֲ��� :
 * 1. ����¼��һ���ַ������� Scanner ʵ��
 * 2. ��ȡ�ַ���ǰ��λ
 * 3. ��ȡ�ַ�������λ
 * 4. ����ȡ��������ַ������м���Ͻ���ƴ�ӣ�������
 */
public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println("�������ֻ�����");
        Scanner sc = new Scanner(System.in);
        String TelNum = sc.nextLine();

        String start = TelNum.substring(0,3);
        String end = TelNum.substring(7);

        System.out.println(start+"****"+end);

    }
}
