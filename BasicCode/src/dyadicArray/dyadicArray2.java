package dyadicArray;

/**
 * @author WYZ
 * @creat 2021-06-02 15:28
 */
public class dyadicArray2 {
    public static void main(String[] args) {
        /*
            ��ά�����д�ŵ���һά���顣���ܲ��ܴ���Ѿ�д�õ�һά����
        */
        int [] arr1 = {11,22,33};
        int [] arr2 = {44,55,66};
        int [] arr3 = {77,88,99};

        int [][] arr = new int[3][3];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        for (int i = 0,j = 0; j<arr1.length ; j++) {
            System.out.println(arr[i][j]);
        }
    }
}
