package StringBuilder;

/**
 * @author WYZ
 * @creat 2021-06-15 8:21
 * ˼·��
 * 1:����һ�� int ���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
 * 2:����һ�����������ڰ� int �����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ������ء�����ֵ���� String�������б� int[] arr
 * 3:�ڷ������� StringBuilder ����Ҫ�����ƴ�ӣ����ѽ��ת�� String ����
 * 4:���÷�������һ���������ս��
 * 5:������
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);

    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }

        }
        sb.append("]");

        String s = sb.toString();

        return s;
    }
}