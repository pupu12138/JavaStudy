package Arraytest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-18 20:51
 * 1.定义一个键盘录入
 * 2.定义一个数值用来存储求和结果
 * 3.动态初始化一个长度为5的数组，准备存储键盘录入的数值
 * 4.将键盘输入的值录入数组
 * 5.遍历数组，取出值
 * 6.计算求和
 */
public class TestArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int [] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("请输入第"+(i+1)+"个整数");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("以上和为："+sum);
    }
}
