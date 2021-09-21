package objectOriented.student2;

/**
 * @author WYZ
 * @creat 2021-06-03 14:48
 */
public class StudentTest {
    private String name;
    private int age;

    public void setAge(int a) {
        age= a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String b){
        name = b;
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println(name+"---"+age);
    }
}
