package Arraytest;

/**
 * @author WYZ
 * @creat 2021-05-18 20:41
 * 获取数组最大值
 *       1.定义一个变量用来存储最大值
 *       2.取数组中第一个位置作为变量的初始值
 *       3.与数组中剩余变量挨个对比
 */
public class TestArray2 {
    public static void main(String[] args) {
        int[] arr={11,123,14,56,17,29,90};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max"+max);
    }
}
