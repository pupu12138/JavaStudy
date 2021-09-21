package Arraytest;

/**
 * @author WYZ
 * @creat 2021-05-18 20:35
 * 数组遍历
 * 使用for循环完成
 * 动态获取数组元素个数的方式；
 *      数组名.length
 */
public class TestArray1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,141,2,3,4,5,6,7,8,9,10,11,12,13,14};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
