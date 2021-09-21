package Arraytest;

/**
 * @author WYZ
 * @creat 2021-05-18 20:25
 * 静态初始化数组
 *     格式：数组类型 [] 数组名称 =new 数组类型[]{元素1，元素2，..........};
 *     简化格式：数组类型[] 数组名称 = {};
 */
public class arrayDemo3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0,1,2,3,4,5,6};
        System.out.println(arr1[1]);
        int[] arr2 = {1,2,3,4,5,6};
        System.out.println(arr2[0]);
    }
}
