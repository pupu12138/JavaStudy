package ArrayListTest;

import ArrayListTest.domain.Student;

/**
 * @author WYZ
 * @creat 2021-06-15 9:37
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
//        初始化长度为3的数据
        Student[] arr = new Student[3];
//        创建3个学生对象
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",22);
        Student stu3 = new Student("王五",20);
//        将对象存入数组
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
        for (int i = 0; i < arr.length; i++) {
            Student temp = arr[i];
            System.out.println(temp.getAge()+"......."+temp.getName());
        }
    }
}
