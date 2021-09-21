package Arraytest;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-18 21:04
 */
public class FindArrayTest {
    public static void main(String[] args) {
        System.out.println("请输入你要查找的数");
        Scanner sc = new Scanner(System.in);//定义一个键盘录入为查找的数据
        int num = sc.nextInt();//定义一个变量为键盘录入的值
        int index = -1;//定义一个索引初始值
        int[] arr = {11,22,33,44,55};//定义一个数组
        /*遍历整个数组
            如果键盘录入的值==数组的数;
            变量index=索引i;
            break;
        */
        for (int i = 0; i <arr.length ; i++) {
            if (num==arr[i]){
                index=i;
                break;
            }
        }
        System.out.println("你查找的数索引值为"+index);
    }
}
