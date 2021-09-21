package ArrayListTest;

import ArrayListTest.domain.Student;

import java.util.ArrayList;

/**
 * @author WYZ
 * @creat 2021-06-16 16:08
 * 案例需求 :
 * 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 * 实现步骤 :
 * 1:定义学生类
 * 2:创建集合对象
 * 3:创建学生对象
 * 4:添加学生对象到集合中
 * 5:遍历集合，采用通用遍历格式实现
 */
public class forArrayList02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
//      2:创建集合对象
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("王五",20);
        Student stu3 = new Student("赵六",19);
        Student stu4 = new Student("李七",21);
//      4:添加学生对象到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
//      5:遍历集合，采用通用遍历格式实现
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getAge()+"......"+ student.getName());
        }



    }
}
