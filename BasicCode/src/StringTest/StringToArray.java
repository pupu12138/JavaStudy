package StringTest;

/**
 * @author WYZ
 * @creat 2021-06-07 17:08
 * ����ƴ���ַ���
 */
public class StringToArray {
    public static void main(String[] args) {
//        ����һ�����飬ʹ�þ�̬��ʼ����ʼ
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println("s" + s);
    }

    //    ����һ��������Ҫ��int����ת��ΪString����
/*    ����ֵ���ͣ�string
       ����int[] arr
 */
    public static String arrayToString(int[] arr) {

        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;

    }
}
