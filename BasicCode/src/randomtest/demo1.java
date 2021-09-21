package randomtest;

import java.util.Random;

/**
 * @author WYZ
 * @creat 2021-05-14 18:37
 */
// 1：创建一个随机数格式：Random r = new Random(); r是可以更改的
// 2：获取随机数：int num = r.nextInt(10)+1;  num可以更改，nextInt(10) 中的 10是指0-10，但不包含10.
public class demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <=10 ; i++) {
            int num = r.nextInt(10)+1;
            System.out.println("--------");
            System.out.println(num);
        }
    }
}
