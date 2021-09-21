package objectOriented.TestAll;

/**
 * @author WYZ
 * @creat 2021-06-05 10:43
 * 创建对象并为其成员变量赋值的两种方法
 *      无参方法创建对象后使用set赋值
 *      使用带参构造方法直接创建带有属性值的对象
 *
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(30);
        s1.setName("林青霞");
        s1.show();

        Student s2=new Student("林青霞",30);
        s2.show();
    }

}
