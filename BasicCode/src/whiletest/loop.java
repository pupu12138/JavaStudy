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
                System.out.println("������һ��100֮�ڵ���");
            }else if (a<0){
                System.out.println("������һ��0-100֮�����");
            }
            else{
                System.out.println("��������ȷ");
                break;
            }
            }
        }
    }

