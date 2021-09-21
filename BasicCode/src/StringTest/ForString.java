package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-05 21:25
 * 键盘录入一个字符串，实用程序实现遍历字符串
 * 使用charAt实现遍历
 */
public class ForString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = sc.nextLine();

        for (int i = 0; i <line.length() ; i++) {
            System.out.println(line.charAt(i));
        }
    }
}
