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
            System.out.println("��������Ҫ�鿴��������");
            if(week==1){
                System.out.println(week+"\n"+"�ܲ�"+"\n"+"��������Ҫ�鿴��������"+"\n"+"�������������0�˳�");
            }else if (week==2){
                System.out.println(week+"\n"+"����"+"\n"+"��������Ҫ�鿴��������"+"\n"+"�������������0�˳�");
            }else if (week==3){
                System.out.println(week+"\n"+"��Ӿ"+"\n"+"��������Ҫ�鿴��������"+"\n"+"�������������0�˳�");
            }else if (week==0){
                System.out.println("��лʹ��");
                break;
            }else {
                System.out.println("������1-3��");
            }
        }
    }
}
