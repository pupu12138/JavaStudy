package whiletest;

/**
 * @author WYZ
 * @creat 2021-05-14 18:47
 */
public class demo1 {
    public static void main(String[] args) {
        int count=0;//定义一个计数器变量；
        double paper = 0.1;//定义纸张变量
        int zf=8844430;//定义珠穆朗玛峰变量
        while (paper<=zf){
            //判定条件：paper<=zf
            paper *=2;//paper厚度乘以2
            count++;//每次乘2后计数器加一;
        }
        System.out.println(count);
    }
}
