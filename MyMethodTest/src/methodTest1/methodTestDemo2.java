package methodTest1;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-19 19:42
 */
public class methodTestDemo2 {
    public static void main(String[] args) {
        jiou();
    }

    public static void jiou() {
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("这个数是偶数");
        }else{
            System.out.println("这个数是奇数");
        }
    }
}
