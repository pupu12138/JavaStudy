package whiletest;

/**
 * @author WYZ
 * @creat 2021-05-14 18:57
 */
/*
    while 语句格式：
    执行初始化语句;
    while(条件判断语句){
        循环体语句;
        条件判断语句;
    }
 */
public class WhileTest {
    public static void main(String[] args) {
//        for (int i = 0; i <=10 ; i++) {
//            System.out.println(i);
            int i = 0;
            while (i<=10){
                i++;
                System.out.println(i);
            }
        }
    }

