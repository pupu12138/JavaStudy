package Arraytest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-19 16:36
 */
public class scoreTest {
    public static void main(String[] args) {
        int [] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("������"+(i+1)+"λ��ί�Ĵ��");
            int score = sc.nextInt();
            if (score>=0&&score<=100){
                arr[i] = score;
            }else{
                System.out.println("������룬������0-100֮�����,����������");
                i--;
            }
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("������"+max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("��С"+min);
        int sum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        int avg = (sum - max - min)/4;
        System.out.println("ƽ����Ϊ"+avg);
    }
}
