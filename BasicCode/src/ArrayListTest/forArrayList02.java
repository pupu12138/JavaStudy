package ArrayListTest;

import ArrayListTest.domain.Student;

import java.util.ArrayList;

/**
 * @author WYZ
 * @creat 2021-06-16 16:08
 * �������� :
 * ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
 * ʵ�ֲ��� :
 * 1:����ѧ����
 * 2:�������϶���
 * 3:����ѧ������
 * 4:���ѧ�����󵽼�����
 * 5:�������ϣ�����ͨ�ñ�����ʽʵ��
 */
public class forArrayList02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
//      2:�������϶���
        Student stu1 = new Student("����",23);
        Student stu2 = new Student("����",20);
        Student stu3 = new Student("����",19);
        Student stu4 = new Student("����",21);
//      4:���ѧ�����󵽼�����
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
//      5:�������ϣ�����ͨ�ñ�����ʽʵ��
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getAge()+"......"+ student.getName());
        }



    }
}
