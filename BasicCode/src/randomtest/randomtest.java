package randomtest;
/**
 * @author WYZ
 * @creat 2021-05-15 15:21
 */
import java.util.Random;
import java.util.Scanner;

/**
 * ������
 * ��������һ�������1-100
 *         Random rd = new Random();
 *         int MachineNumber = rd.nextInt(100)+1;
 *ѭ��:������ѭ����
 * while(){}
 * �ڲ�ʹ�ã�if elseif if;��������ȷ������
 */
public class randomtest {
    public static void main(String[] args) {
        Random rd = new Random();
        int MachineNumber = rd.nextInt(100)+1;
        while (true){
            System.out.println("��������µ�����");
            Scanner sc = new Scanner(System.in);
            int HumanNumber = sc.nextInt();
            if (HumanNumber>MachineNumber){
                System.out.println("��������������ҵ�����Ŷ");
                System.out.println("������Ŷ");
            }else if (HumanNumber<MachineNumber){
                System.out.println("���������С���ҵ�����Ŷ");
                System.out.println("�����Ŭ��Ŷ");
            }if(HumanNumber==MachineNumber){
                System.out.println("��¶�������ϲ");
                break;
            }
        }
    }
}
