package methodTest1;

/**
 * @author WYZ
 * @creat 2021-05-20 18:28
 *
 *             方法参数传递的类型为基础类型；
 *             传递类型为数组地址；
 */
public class methodReloadPassTest3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println(arr[1]);
        change(arr);//此处调用后为修改后的数组元素
        System.out.println(arr[1]);

    }public static void change(int[] arr){
        /*此处传入的为数组的地址*/
        arr[1]=200;
    }
}
