package objectOriented.TestAll;

/**
 * @author WYZ
 * @creat 2021-06-05 10:43
 * ��Ա����ʹ��private����
 * ���췽��
 *      �ṩһ���޲ι��췽��
 *      �ṩһ������������Ĺ��췽��
 * ��Ա����
 *      �ṩÿһ��������set()  get()
 *      �ṩһ����ʾ�������Ϣ��show()
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
