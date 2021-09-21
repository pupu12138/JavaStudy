package StringTest;

/**
 * @author WYZ
 * @creat 2021-06-05 14:53
 * public string():创建一个空白字符串对象，不含任何内容
 * public String(char[] chs):创建一个字符数组，根据字符数组内容创建字符串对象
 * public String(byte[] bys):创建一个字节数组，根据字符数组内容创建字符串对象
 * String s = "abc" 直接赋值的方式创建字符串对象，内容就是abc
 *
 * 推荐使用直接赋值的方式获取字符串
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = new String();
//        创建一个无参的string
        System.out.println("s1"+s1);
//        不会输出任何东西，或地址
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2"+s2);
//      public String(char[] chs):创建一个字符数组，根据字符数组内容创建字符串对象

        byte[] bys ={97,98,99};
        String s3 = new String(bys);
        System.out.println("s3"+s3);
//      public String(byte[] bys):创建一个字节数组，根据字符数组内容创建字符串对象
//      结果：abc（底层中，97，98，99指代的字节a,b,c）

//      String s = "abc" 直接赋值的方式创建字符串对象，内容就是abc
        String s4 ="abc";
        System.out.println("s4"+s4);
    }
}
