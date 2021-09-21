package methodTest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-19 19:55
 * 带返回值的方法调用：格式
 * public static 数据类型 方法名(){
 *
 * }return 数据类型;
 * 注意：数据类型需要和返回值的数据类型相等。否则报错
 */
public class methodTestTry {
    public static void main(String[] args) {
        System.out.println("请输入开始的数字");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("请输入结束的数字");
        int end = sc.nextInt();
        forList(start,end);


    }
    public static void forList(int start,int end){
        int[] arr = new int[end-start+1];
        int j=0;
        for (int i =start ; i <=end ; i++) {
            arr[j] = i;
            j++;
        }
        System.out.println("开始到结束所有数奇数和为："+isEvenNumber(arr));
    }
    public static int isEvenNumber(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
