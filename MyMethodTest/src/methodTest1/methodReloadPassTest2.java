package methodTest1;

/**
 * @author WYZ
 * @creat 2021-05-20 18:15
 */
public class methodReloadPassTest2 {
    public static void main(String[] args) {
        /*
            方法参数传递的类型为基础类型；
            传入方法中的是具体的数据。
        */
        int number = 100;
        System.out.println("调用change方法前"+number);
        change(number);
        System.out.println("调用change方法后"+number);//输出结果为：100
    }
    public static void change (int number){
         number = 200;
    }
}
