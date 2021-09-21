package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-06 21:14
 * 键盘录入一个字符串，统计该字符串中大写写字母字符，小写字母字符，数字字符出现的次数
 */
public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = sc.nextLine();
//        统计字符个数需要定义三个统计变量，初始值为0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
//        遍历
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
//            将每一个字符存入ch
//            判断条件
            if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字符" + bigCount);
        System.out.println("小写字符" + smallCount);
        System.out.println("数字字符" + numberCount);
    }
}
