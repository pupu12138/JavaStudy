package Reverse;

/**
 * @author WYZ
 * @creat 2021-05-20 21:52
 * 需求：要求将整个数组的第一个元素和数组的最后一个元素进行交换
 * 实现：定义一个第三方元素存储第一个数组元素，第一个等于最后一个，最后一个等于第三方元素的值。
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
