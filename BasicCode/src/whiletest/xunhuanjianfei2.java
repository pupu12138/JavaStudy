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
            System.out.println("����������鿴������"+"\n"+"�����˳��밴0");
            Scanner sc = new Scanner(System.in);
            int week = sc.nextInt();
            if (week>4){
                System.out.println("������1-4��������");
                break;
            }else if (week<1) {
                System.out.println("��������ȷ������");
            }
            switch (week){
                case 0:
                    System.out.println("��лʹ��");
                    break lo;
                case 1:
                    System.out.println("�ܲ�");
                    break;
                case 2:
                    System.out.println("��Ӿ");
                    break;
                case 3:
                    System.out.println("����");
                    break;
                case 4:
                    System.out.println("�ܲ�");
                    break;
            }
        }
    }
}
