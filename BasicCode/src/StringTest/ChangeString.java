package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 22:14
 * 案例需求 :
 * 键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
 * 实现步骤 :
 * 1. 键盘录入一个字符串，用 Scanner 实现
 * 2. 替换敏感词
 *  String replace(CharSequence target, CharSequence replacement)
 *  将当前字符串中的target内容，使用replacement进行替换，返回新的字符串
 * 3. 输出结果
 */
public class ChangeString {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String result = line.replace("TMD","***");
        System.out.println(result);
    }
}
