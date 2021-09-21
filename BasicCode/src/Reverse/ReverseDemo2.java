package Reverse;

/**
 * @author WYZ
 * @creat 2021-05-20 22:05
 * 需求：将数组[11,22,33,44,55,66,77]进行交换
 * 1:定义数组
 * 2：定义开始指针
 * 3：定义结束指针为数组长度-1
 * 4：for循环
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
