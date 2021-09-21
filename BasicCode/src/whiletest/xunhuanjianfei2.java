package whiletest;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-14 21:27
 */
public class xunhuanjianfei2 {
    public static void main(String[] args) {
        lo:while (true){
            System.out.println("请输入你想查看的星期"+"\n"+"如需退出请按0");
            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();
            if (week>4){
                System.out.println("请输入1-4的星期数");
                break;
            }else if (week<1) {
                System.out.println("请输入正确的数据");
            }
            switch (week){
                case 0:
                    System.out.println("感谢使用");
                    break lo;
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("跳绳");
                    break;
                case 4:
                    System.out.println("跑步");
                    break;
            }
        }
    }
}
