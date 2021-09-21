package dyadicArray;

/**
 * @author WYZ
 * @creat 2021-06-02 20:53
 */
public class dyadicArray3 {
    public static void main(String[] args) {
        int [][] arr= {{11,22,33},{33,44,55}};
//        定义一个二维数组
        for (int i = 0; i <arr.length ; i++) {
//            遍历每一个一维数组，取出里面每一个一维数组
            for (int j = 0; j <arr[i].length ; j++) {
//            遍历每一个一维数组里面的每一个元素
                System.out.println(arr[i][j]);
            }
        }
    }
}
