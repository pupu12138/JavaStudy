package Scannertest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-12 14:41
 */

/**
 * 创建对象
  Scanner sc = new Scanner(System.in);
    只有sc 可以随意更改，其他的都是固定格式。
 *使用变量接收数据
    int i = sc.nextInt();
    只有变量i可以随意更改，其他为固定格式。
 */
public class scannertest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
}
