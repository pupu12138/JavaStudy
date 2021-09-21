package StringBuilder;

/**
 * @author WYZ
 * @creat 2021-06-08 21:14
 * StringBuilder转换为String
 *      public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String
 * String转换为StringBuilder
 *      public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
 */
public class StringBuliderToString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello ");
//        String s = sb是错误的
//        StringBuilder转换为String
//        public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println(s);

        String s1 = "hello";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
//        stringBuilder 转换为string

    }
}
