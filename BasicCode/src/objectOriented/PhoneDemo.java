package objectOriented;

/**
 * @author WYZ
 * @creat 2021-06-03 9:21
 * ʹ�ó�Ա������
 *      ��ʽ������.������
 *      ��ʽ p.brand
 * ʹ�ó�Ա������
 *      ������.������()
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
