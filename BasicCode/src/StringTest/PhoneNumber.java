package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 22:07
 * 以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽 最终效果为：1561234
 * 实现步骤 :
 * 1. 键盘录入一个字符串，用 Scanner 实现
 * 2. 截取字符串前三位
 * 3. 截取字符串后四位
 * 4. 将截取后的两个字符串，中间加上进行拼接，输出结果
 */
public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println("请输入手机号码");
        Scanner sc = new Scanner(System.in);
        String TelNum = sc.nextLine();

        String start = TelNum.substring(0,3);
        String end = TelNum.substring(7);

        System.out.println(start+"****"+end);

    }
}
