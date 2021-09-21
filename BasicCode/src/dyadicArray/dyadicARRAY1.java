package dyadicArray;

/**
 * @author WYZ
 * @creat 2021-06-02 9:16
 * 二维数组格式：变量类型[][] 变量名 = new 变量类型[想存几个][一个里面存几个]
 */
public class dyadicARRAY1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr);
   /*    [[I@6f496d9f
          [[表示几维数组
          I表什数据类型
          @分隔符
          6f496d9f内存地址
   */
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        /*  [I@723279cf
            [I@10f87f48
            [I@b4c966a
            存的都是一维数组的内存地址
        */
        System.out.println(arr[0][0]);
        arr[0][1]=13;
        System.out.println(arr[0][1]);
        // 打印第几个数组中的第几个元素
    }
}
