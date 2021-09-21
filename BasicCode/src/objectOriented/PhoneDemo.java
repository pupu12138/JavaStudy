package objectOriented;

/**
 * @author WYZ
 * @creat 2021-06-03 9:21
 * 使用成员变量：
 *      格式对象名.变量名
 *      范式 p.brand
 * 使用成员方法：
 *      对象名.方法名()
 *      p.call()
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p =new Phone();
        p.brand="iPhone";
        p.price=7999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.sendMessage();

    }
}
