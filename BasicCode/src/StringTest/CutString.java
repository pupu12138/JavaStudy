package StringTest;

import StringTest.domain.Student;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-06-07 19:32
 * �����и��ַ���
 *      ���ַ�������ʽ���Ӽ���¼��һ��ѧ����Ϣ���硰������23�����Ӹ��ַ������и����Ч���ݣ���װΪStudentѧ������
 */
public class CutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ ����������");
        String stuInfo = sc.nextLine();
        String[] sArr = stuInfo.split("��");
//      ���һ��
//        System.out.println(split[0]);
//        System.out.println(split[1]);

//        �ӵõ����ַ�������ȡ��Ԫ�����ݣ�ͨ��student����вι��췽����װΪ����
        Student stu = new Student(sArr[0],sArr[1]);
        System.out.println(stu.getName()+"...."+stu.getAge());
    }


}

