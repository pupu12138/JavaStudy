package ArrayListTest;

import ArrayListTest.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-16 16:32
 * 案例需求 :
 * 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 * 学生的姓名和年龄来自于键盘录入
 * 实现步骤 :
 * 1:定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
 * 2:创建集合对象
 * 3:键盘录入学生对象所需要的数据
 * 4:创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
 * 5:往集合中添加学生对象
 * 6:遍历集合，采用通用遍历格式实现
 */
public class scannerArrayList {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println("学生信息"+student.getAge()+"....."+student.getName());
        }


    }

    private static Student getStudent() {
        //        3:键盘录入学生对象所需要的数据
        System.out.println("请输入学生姓名：");
        Scanner sc = new Scanner(System.in);
//        next() nextLine() nextInt() 如果nextLine() nextInt()配合使用 nextLine()不会接收元素
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age =sc.nextInt();
//        4:创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student stu = new Student(name,age);

        return stu;
    }
}