package API;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-05 14:43
 * scanner
 *      用于获取键盘录入数据(基本数据类型，字符串类型)
 * public string line();
 *      获取键盘录入字符串数据
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
//        String line = sc.nextLine();
        String line = sc.nextLine();//ctrl+alt+v快捷键自动生成
        System.out.println("你输入的数据是：" + line);
    }
}
