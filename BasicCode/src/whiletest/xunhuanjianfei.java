package whiletest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-14 21:06
 */
public class xunhuanjianfei {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();
            System.out.println("请输入您要查看的星期数");
            if(week==1){
                System.out.println(week+"\n"+"跑步"+"\n"+"请输入您要查看的星期数"+"\n"+"如需结束请输入0退出");
            }else if (week==2){
                System.out.println(week+"\n"+"跳绳"+"\n"+"请输入您要查看的星期数"+"\n"+"如需结束请输入0退出");
            }else if (week==3){
                System.out.println(week+"\n"+"游泳"+"\n"+"请输入您要查看的星期数"+"\n"+"如需结束请输入0退出");
            }else if (week==0){
                System.out.println("感谢使用");
                break;
            }else {
                System.out.println("请输入1-3周");
            }
        }
    }
}
