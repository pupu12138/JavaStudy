package API;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-05 14:43
 * scanner
 *      ���ڻ�ȡ����¼������(�����������ͣ��ַ�������)
 * public string line();
 *      ��ȡ����¼���ַ�������
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
//        String line = sc.nextLine();
        String line = sc.nextLine();//ctrl+alt+v��ݼ��Զ�����
        System.out.println("������������ǣ�" + line);
    }
}
