package methodTest1;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-20 19:06
 * ����ͬʱ��ȡ��������ֵ��Сֵ
 */
public class methodTestTry4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("����������");
            int num = sc.nextInt();
            arr[i]=num;
        }
        max(arr);
        min(arr);
        System.out.println("���"+max(arr)+"��С"+min(arr));
    }
    public static int max(int [] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
     return max;
    }
    public static int min(int [] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (min>arr[i]){
                arr[i]=min;
            }
        }
       return min;
    }
}
