package Reverse;

/**
 * @author WYZ
 * @creat 2021-05-20 21:52
 * ����Ҫ����������ĵ�һ��Ԫ�غ���������һ��Ԫ�ؽ��н���
 * ʵ�֣�����һ��������Ԫ�ش洢��һ������Ԫ�أ���һ���������һ�������һ�����ڵ�����Ԫ�ص�ֵ��
 */
public class ReverseDemo1 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int temp=arr[0];
        arr[0]=arr[4];
        arr[4]=temp;
        System.out.println(arr[0]+" "+arr[4]);
    }
}
