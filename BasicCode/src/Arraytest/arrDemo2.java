package Arraytest;

/**
 * @author WYZ
 * @creat 2021-05-18 20:11
 * 数组动态初始化时
 *      数组会自动为数组元素设置初始值
 *      数组访问格式：数组名[索引]
 *      作用：访问空间位置
 *      注意：
 *          数组创建完毕后，即使没有赋值，也可以取出，但取出的是默认初始化值。
 *      赋值：数组名[索引]=数值;
 */
public class arrDemo2 {
    public static void main(String[] args) {
        int[] arr =new int[5];
        //数组名[索引] 访问数组容器中的空间位置
        System.out.println(arr[0]);
        System.out.println("----------");
        arr[0]=11;
        arr[1]=22;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
