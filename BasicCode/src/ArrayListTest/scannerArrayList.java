package ArrayListTest;

import ArrayListTest.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-16 16:32
 * �������� :
 * ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
 * ѧ�������������������ڼ���¼��
 * ʵ�ֲ��� :
 * 1:����ѧ���࣬Ϊ�˼���¼�����ݷ��㣬��ѧ�����еĳ�Ա����������ΪString����
 * 2:�������϶���
 * 3:����¼��ѧ����������Ҫ������
 * 4:����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
 * 5:�����������ѧ������
 * 6:�������ϣ�����ͨ�ñ�����ʽʵ��
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
            System.out.println("ѧ����Ϣ"+student.getAge()+"....."+student.getName());
        }


    }

    private static Student getStudent() {
        //        3:����¼��ѧ����������Ҫ������
        System.out.println("������ѧ��������");
        Scanner sc = new Scanner(System.in);
//        next() nextLine() nextInt() ���nextLine() nextInt()���ʹ�� nextLine()�������Ԫ��
        String name = sc.next();
        System.out.println("������ѧ�����䣺");
        int age =sc.nextInt();
//        4:����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
        Student stu = new Student(name,age);

        return stu;
    }
}