package Arraytest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-18 20:51
 * 1.����һ������¼��
 * 2.����һ����ֵ�����洢��ͽ��
 * 3.��̬��ʼ��һ������Ϊ5�����飬׼���洢����¼�����ֵ
 * 4.�����������ֵ¼������
 * 5.�������飬ȡ��ֵ
 * 6.�������
 */
public class TestArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int [] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("�������"+(i+1)+"������");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("���Ϻ�Ϊ��"+sum);
    }
}
