package StringTest;

import StringTest.domain.Student;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 19:32
 * 需求：切割字符串
 *      以字符串的形式，从键盘录入一个学生信息例如“张三，23”，从该字符串中切割出有效数据，封装为Student学生对象
 */
public class CutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 姓名，年龄");
        String stuInfo = sc.nextLine();
        String[] sArr = stuInfo.split("，");
//      输出一下
//        System.out.println(split[0]);
//        System.out.println(split[1]);

//        从得到的字符串当中取出元素内容，通过student类的有参构造方法封装为对象。
        Student stu = new Student(sArr[0],sArr[1]);
        System.out.println(stu.getName()+"...."+stu.getAge());
    }


}

