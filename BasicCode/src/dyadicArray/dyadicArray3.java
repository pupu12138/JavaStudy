package dyadicArray;

/**
 * @author WYZ
 * @creat 2021-06-02 20:53
 */
public class dyadicArray3 {
    public static void main(String[] args) {
        int [][] arr= {{11,22,33},{33,44,55}};
//        ����һ����ά����
        for (int i = 0; i <arr.length ; i++) {
//            ����ÿһ��һά���飬ȡ������ÿһ��һά����
            for (int j = 0; j <arr[i].length ; j++) {
//            ����ÿһ��һά���������ÿһ��Ԫ��
                System.out.println(arr[i][j]);
            }
        }
    }
}
