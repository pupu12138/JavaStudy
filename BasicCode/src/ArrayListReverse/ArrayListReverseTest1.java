package ArrayListReverse;

/**
 * @author WYZ
 * @creat 2021-06-01 10:20
 * ����Ԫ�ء�����һ��ͷָ�룬һ��βָ����н���
 */
public class ArrayListReverseTest1 {
    public static void main(String[] args) {
        int[] arr= {55,44,33,22,11};
        int start = 0;
        int end = arr.length-1;
        for (; start <end ; start++,end--) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
