package StringBuilder;

/**
 * @author WYZ
 * @creat 2021-06-08 20:32
 * public StringBuilder()������һ���հ׿ɱ��ַ������󣬲������κ�����
 * public StringBuilder(String str)�������ַ��������ݣ��������ɱ��ַ�������
 */
public class StringBuilder01 {
    public static void main(String[] args) {
//  public StringBuilder()������һ���հ׿ɱ��ַ������󣬲������κ�����
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println("sb.length():"+sb.length());

//   public StringBuilder(String str)�������ַ��������ݣ��������ɱ��ַ�������
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2);
        System.out.println("sb2.length:"+sb2.length());
    }
}
