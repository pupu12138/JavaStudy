package randomtest;
/**
 * @author WYZ
 * @creat 2021-05-15 15:21
 */
import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 * 首先生成一个随机数1-100
 *         Random rd = new Random();
 *         int MachineNumber = rd.nextInt(100)+1;
 *循环:运用死循环。
 * while(){}
 * 内部使用：if elseif if;当条件正确跳出。
 */
public class randomtest {
    public static void main(String[] args) {
        Random rd = new Random();
        int MachineNumber = rd.nextInt(100)+1;
        while (true){
            System.out.println("请输入你猜的数字");
            Scanner sc = new Scanner(System.in);
            int HumanNumber = sc.nextInt();
            if (HumanNumber>MachineNumber){
                System.out.println("你输入的数大于我的数字哦");
                System.out.println("继续猜哦");
            }else if (HumanNumber<MachineNumber){
                System.out.println("你输入的数小于我的数字哦");
                System.out.println("请继续努力哦");
            }if(HumanNumber==MachineNumber){
                System.out.println("你猜对啦！恭喜");
                break;
            }
        }
    }
}
