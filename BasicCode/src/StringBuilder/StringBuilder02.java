package StringBuilder;

/**
 * @author WYZ
 * @creat 2021-06-08 20:47
 * public StringBuilder append(��������) ������ݣ������ض�����
 * public StringBuilder reverse() �����෴���ַ�����
 */
public class StringBuilder02 {
    public static void main(String[] args) {
//        ��������
        StringBuilder sb = new StringBuilder();
//        public StringBuilder append(��������) ������ݣ������ض�����
//        StringBuilder sb2 = sb.append("hello");

//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb);
//        System.out.println(sb ==sb2);
//        ����ֵΪtrue
 /*       sb.append("hello ");
          sb.append("world ");
          sb.append("100");
          System.out.println("sb:"+sb);
          ��� sb:hello world 100
 */
//        ��ʽ���
        sb.append("hello  ").append("world ").append("100");
        System.out.println("sb:"+sb);
//        �����ͬ
//        public StringBuilder reverse() �����෴���ַ�����
        sb.reverse();
        System.out.println("sb:"+sb);
//        ֱ�ӽ����˷�ת

    }
}
