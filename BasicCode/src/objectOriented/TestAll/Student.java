package objectOriented.TestAll;

/**
 * @author WYZ
 * @creat 2021-06-05 10:43
 * 成员变量使用private修饰
 * 构造方法
 *      提供一个无参构造方法
 *      提供一个带多个参数的构造方法
 * 成员方法
 *      提供每一个变量的set()  get()
 *      提供一个显示对象的信息的show()
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
