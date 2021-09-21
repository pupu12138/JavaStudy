package whiletest;

import java.text.BreakIterator;
import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-14 20:38
 */
public class loop {
    public static void main(String[] args) {
        while(true){
            Scanner sc=new Scanner(System.in);
            int a =sc.nextInt();
            if (a>=100){
                System.out.println("请输入一个100之内的数");
            }else if (a<0){
                System.out.println("请输入一个0-100之间的数");
            }
            else{
                System.out.println("你输入正确");
                break;
            }
            }
        }
    }

