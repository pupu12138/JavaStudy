package StringBuilder;

/**
 * @author WYZ
 * @creat 2021-06-08 21:14
 * StringBuilderת��ΪString
 *      public String toString()��ͨ�� toString() �Ϳ���ʵ�ְ� StringBuilder ת��Ϊ String
 * Stringת��ΪStringBuilder
 *      public StringBuilder(String s)��ͨ�����췽���Ϳ���ʵ�ְ� String ת��Ϊ StringBuilder
 */
public class StringBuliderToString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello ");
//        String s = sb�Ǵ����
//        StringBuilderת��ΪString
//        public String toString()��ͨ�� toString() �Ϳ���ʵ�ְ� StringBuilder ת��Ϊ String
        String s = sb.toString();
        System.out.println(s);

        String s1 = "hello";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
//        stringBuilder ת��Ϊstring

    }
}
