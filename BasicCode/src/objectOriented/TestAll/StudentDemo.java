package objectOriented.TestAll;

/**
 * @author WYZ
 * @creat 2021-06-05 10:43
 * ��������Ϊ���Ա������ֵ�����ַ���
 *      �޲η������������ʹ��set��ֵ
 *      ʹ�ô��ι��췽��ֱ�Ӵ�����������ֵ�Ķ���
 *
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(30);
        s1.setName("����ϼ");
        s1.show();

        Student s2=new Student("����ϼ",30);
        s2.show();
    }

}
