package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-05 20:18
 * ����
 *      ��֪�û��������룬���ó���ʵ��ģ���û���¼���ܹ����λ��ᣬ��¼֮�󣬸�����Ӧ��ʾ
 */
public class LogInTest {
    public static void main(String[] args) {
        String name = "������";
        String code = "990716wuyuzhu";
//        System.out.println("�������û���");
//        Scanner sc = new Scanner(System.in);
//        String sin = sc.nextLine();
//        System.out.println("����������");
//        String sco = sc.nextLine();
//        if (sin.equals(name)&&sco.equals(code)){
//            System.out.println("��½�ɹ�");
//        }else{
//            System.out.println("�û��������벻��ȷ");
//        }
        for (int i = 3; i >0 ; i--) {
            System.out.println("�������û���");
            Scanner sc = new Scanner(System.in);
            String sin = sc.nextLine();
            System.out.println("����������");
            String sco = sc.nextLine();
            if (sin.equals(name)&&sco.equals(code)){
                System.out.println("��½�ɹ�");
                break;
            }else{
                System.out.println("�û��������벻��ȷ");
                if(i==1){
                    System.out.println("�����λ��������ˣ�");
                    break;
                }
                System.out.println("�㻹��"+(i-1)+"�λ���");
            }
        }

    }
}
