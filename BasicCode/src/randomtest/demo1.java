package randomtest;

import java.util.Random;

/**
 * @author WYZ
 * @creat 2021-05-14 18:37
 */
// 1������һ���������ʽ��Random r = new Random(); r�ǿ��Ը��ĵ�
// 2����ȡ�������int num = r.nextInt(10)+1;  num���Ը��ģ�nextInt(10) �е� 10��ָ0-10����������10.
public class demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <=10 ; i++) {
            int num = r.nextInt(10)+1;
            System.out.println("--------");
            System.out.println(num);
        }
    }
}
