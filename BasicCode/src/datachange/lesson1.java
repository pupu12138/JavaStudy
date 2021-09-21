package datachange;

/**
 * @author WYZ
 * @creat 2021-05-10 17:17
 */
/*
强制转换：把一个表示数据范围大的数值或者变量赋值给另一个表示数据范围小的变量
简单理解：大的给小的，不能直接赋值，需要强转
格式： 目标数据类型 变量名 = （目标数据类型）值或者变量
 */
public class lesson1 {
    public static void main(String[] args) {
        int a = 10; //int 4个字节
        byte b = (byte) a;//byte 1个字节  Error:(15, 18) java: 不兼容的类型: 从int转换到byte可能会有损失;改为byte b = (byte) a;
        System.out.println(b);

        double num1 = 12.9;
        int num2 = (int) num1;//     Error:(19, 20) java: 不兼容的类型: 从double转换到int可能会有损失精度
        System.out.println(num2);// 结果：12
    }
}
