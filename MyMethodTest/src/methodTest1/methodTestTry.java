package methodTest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-19 19:55
 * ������ֵ�ķ������ã���ʽ
 * public static �������� ������(){
 *
 * }return ��������;
 * ע�⣺����������Ҫ�ͷ���ֵ������������ȡ����򱨴�
 */
public class methodTestTry {
    public static void main(String[] args) {
        System.out.println("�����뿪ʼ������");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("���������������");
        int end = sc.nextInt();
        forList(start,end);


    }
    public static void forList(int start,int end){
        int[] arr = new int[end-start+1];
        int j=0;
        for (int i =start ; i <=end ; i++) {
            arr[j] = i;
            j++;
        }
        System.out.println("��ʼ������������������Ϊ��"+isEvenNumber(arr));
    }
    public static int isEvenNumber(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
