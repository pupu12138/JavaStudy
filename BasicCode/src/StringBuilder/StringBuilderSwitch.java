package StringBuilder;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-15 9:21
 * 定义一个方法实现字符串的反转，键盘输入字符串，反转输出。
 * 例如：输入abc输出cba
 * 定义一个方法，实现字符串的反转 返回值String 参数string s
 * 在方法中使用stringBuilder实现字符串反转，并把结果转成string返回
 * 调用方法 用一个变量接收数据
 * 输出结果
 */
public class StringBuilderSwitch {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s = switchString(line);
        System.out.println(s);
    }
    public static  String switchString(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String s1 = sb.toString();
//        return s1;
        return new StringBuilder(s).reverse().toString();
    }
}
