package dyadicArray;

/**
 * @author WYZ
 * @creat 2021-06-02 21:33
 */
public class dyadicArrayTest1 {
    public static void main(String[] args) {
        int sum = 0;
        int [][] arr={{11,22,33},{11,22,33},{11,22,33},{11,22,33}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum +=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
