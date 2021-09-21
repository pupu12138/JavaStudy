package methodTest1;

/**
 * @author WYZ
 * @creat 2021-05-20 11:22
 */
public class methodReloadTest1 {
    /*需求：
    使用方法重载的方法，设计比较两个整数是否相同的方法，兼容全整数类型（byte short int long）
    */
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(compare(a,b));
    }
    public static boolean compare(int a,int b){
        return a==b;
    }

    public static boolean compare(byte a,byte b){
        return a==b;
    }
    public static boolean compare(short a,short b){
        return a==b;
    }
    public static boolean compare(long a,long b){
        return a==b;
    }
}
