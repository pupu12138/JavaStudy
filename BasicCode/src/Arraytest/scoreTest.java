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
            System.out.println("请输入"+(i+1)+"位评委的打分");
            int score = sc.nextInt();
            if (score>=0&&score<=100){
                arr[i] = score;
            }else{
                System.out.println("检查输入，请输入0-100之间的数,请重新输入");
                i--;
            }
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("最大分数"+max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("最小"+min);
        int sum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        int avg = (sum - max - min)/4;
        System.out.println("平均分为"+avg);
    }
}
