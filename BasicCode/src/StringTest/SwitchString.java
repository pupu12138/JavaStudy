package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 17:27
 * 定义一个方法，实现字符串的反转，键盘录入一个字符串，调用该方法后在控制台输出结果
 * 用例abc 输出 cba
 */
public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");

        String line = sc.nextLine();
        String s = SwitchString(line);
        System.out.println(s);

    }
//    定义一个方法
    /*
    两个明确
        明确返回值类型：string
        参数：string
     */

    public static String SwitchString(String s) {
        String ss = "";
//        反向遍历字符串
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }

        return ss;
    }
}
