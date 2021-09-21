package methodTest1;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-19 19:48
 * 带参数的方法调用格式： public static void jiou(参数){
 *
 * }
 * 调用格式：方法名(变量/常量)
 */
public class methodTestDemo3 {
    public static void main(String[] args) {
        System.out.println("请输入你想算的数");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        jiou(num);
    }
    public static void jiou(int num){
        if (num%2==0){
            System.out.println("这个数是偶数");
        }else {
            System.out.println("这个数是奇数");
        }
    }
}
