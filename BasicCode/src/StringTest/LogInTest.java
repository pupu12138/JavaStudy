package StringTest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-05 20:18
 * 需求：
 *      已知用户名和密码，请用程序实现模拟用户登录，总共三次机会，登录之后，给出相应提示
 */
public class LogInTest {
    public static void main(String[] args) {
        String name = "吴玉竹";
        String code = "990716wuyuzhu";
//        System.out.println("请输入用户名");
//        Scanner sc = new Scanner(System.in);
//        String sin = sc.nextLine();
//        System.out.println("请输入密码");
//        String sco = sc.nextLine();
//        if (sin.equals(name)&&sco.equals(code)){
//            System.out.println("登陆成功");
//        }else{
//            System.out.println("用户名或密码不正确");
//        }
        for (int i = 3; i >0 ; i--) {
            System.out.println("请输入用户名");
            Scanner sc = new Scanner(System.in);
            String sin = sc.nextLine();
            System.out.println("请输入密码");
            String sco = sc.nextLine();
            if (sin.equals(name)&&sco.equals(code)){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("用户名或密码不正确");
                if(i==1){
                    System.out.println("你三次机会用完了！");
                    break;
                }
                System.out.println("你还有"+(i-1)+"次机会");
            }
        }

    }
}
