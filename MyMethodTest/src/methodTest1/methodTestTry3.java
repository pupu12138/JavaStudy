package methodTest1;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-20 11:02
 * 1����Scanner sc = new Scanner()�������������
 * 2 ����  a,bΪ�������
 * 3 �����ж��������βν����������
 * 4 if����и��ݽṹreturn���Ӧ��ֵ
 * 5 �������У�����result����=����ֵ������ӡ
 */
public class methodTestTry3 {
    public static void main(String[] args) {
        System.out.println("������������");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = compare(a,b);
        System.out.println(result);
    }
    public static int compare(int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }

    }
}
