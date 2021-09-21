package ArrayListTest;

import ArrayListTest.domain.Student;

import java.util.ArrayList;

/**
 * @author WYZ
 * @creat 2021-06-16 21:09
 */
public class screenArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("赵四", 17);
        Student stu3 = new Student("王五", 16);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        ArrayList<Student> newlist = getlist(list);
        for (int i = 0; i <newlist.size() ; i++) {
            Student stu = newlist.get(i);
            System.out.println(stu.getAge()+"......"+stu.getName());
        }

    }

    public static ArrayList<Student> getlist(ArrayList<Student> list) {
        ArrayList<Student> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int stuAge = stu.getAge();
            if (stuAge < 18) {
                newlist.add(stu);
            }
        }
        return newlist;
    }
}
