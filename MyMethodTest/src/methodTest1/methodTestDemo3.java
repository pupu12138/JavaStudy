package methodTest1;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-19 19:48
 * �������ķ������ø�ʽ�� public static void jiou(����){
 *
 * }
 * ���ø�ʽ��������(����/����)
 */
public class methodTestDemo3 {
    public static void main(String[] args) {
        System.out.println("���������������");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        jiou(num);
    }
    public static void jiou(int num){
        if (num%2==0){
            System.out.println("�������ż��");
        }else {
            System.out.println("�����������");
        }
    }
}
