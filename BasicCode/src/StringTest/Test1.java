package StringTest;

/**
 * @author WYZ
 * @creat 2021-06-05 14:53
 * public string():����һ���հ��ַ������󣬲����κ�����
 * public String(char[] chs):����һ���ַ����飬�����ַ��������ݴ����ַ�������
 * public String(byte[] bys):����һ���ֽ����飬�����ַ��������ݴ����ַ�������
 * String s = "abc" ֱ�Ӹ�ֵ�ķ�ʽ�����ַ����������ݾ���abc
 *
 * �Ƽ�ʹ��ֱ�Ӹ�ֵ�ķ�ʽ��ȡ�ַ���
 */
public class Test1 {
    public static void main(String[] args) {
        String s1 = new String();
//        ����һ���޲ε�string
        System.out.println("s1"+s1);
//        ��������κζ��������ַ
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2"+s2);
//      public String(char[] chs):����һ���ַ����飬�����ַ��������ݴ����ַ�������

        byte[] bys ={97,98,99};
        String s3 = new String(bys);
        System.out.println("s3"+s3);
//      public String(byte[] bys):����һ���ֽ����飬�����ַ��������ݴ����ַ�������
//      �����abc���ײ��У�97��98��99ָ�����ֽ�a,b,c��

//      String s = "abc" ֱ�Ӹ�ֵ�ķ�ʽ�����ַ����������ݾ���abc
        String s4 ="abc";
        System.out.println("s4"+s4);
    }
}
