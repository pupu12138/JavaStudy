package methodTest1;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-20 11:02
 * 1设置Scanner sc = new Scanner()接收输入的数；
 * 2 定义  a,b为输入的数
 * 3 方法中定义两个形参接收输入的数
 * 4 if语句中根据结构return相对应的值
 * 5 主方法中，定义result参数=返回值，并打印
 */
public class methodTestTry3 {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
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
