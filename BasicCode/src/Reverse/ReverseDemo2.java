package Reverse;

/**
 * @author WYZ
 * @creat 2021-05-20 22:05
 * ���󣺽�����[11,22,33,44,55,66,77]���н���
 * 1:��������
 * 2�����忪ʼָ��
 * 3���������ָ��Ϊ���鳤��-1
 * 4��forѭ��
 */
public class ReverseDemo2 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        int start = 0;
        int end = arr.length-1;
        for ( ; start < end; start++,end--) {
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
