package Arraytest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-18 21:04
 */
public class FindArrayTest {
    public static void main(String[] args) {
        System.out.println("��������Ҫ���ҵ���");
        Scanner sc = new Scanner(System.in);//����һ������¼��Ϊ���ҵ�����
        int num = sc.nextInt();//����һ������Ϊ����¼���ֵ
        int index = -1;//����һ��������ʼֵ
        int[] arr = {11,22,33,44,55};//����һ������
        /*������������
            �������¼���ֵ==�������;
            ����index=����i;
            break;
        */
        for (int i = 0; i <arr.length ; i++) {
            if (num==arr[i]){
                index=i;
                break;
            }
        }
        System.out.println("����ҵ�������ֵΪ"+index);
    }
}
