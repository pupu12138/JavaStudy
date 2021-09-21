package objectOriented.This;

/**
 * @author WYZ
 * @creat 2021-06-03 15:03
 */
public class Student {
    private String name;
    private int age;

//    public void setAge(int a) {
//        age= a;
//    }
    public void setAge(int age){
        this.age = age;
//        this修饰的变量指代的是成员变量。
//        方法的形参如果和成员变量同名，不带this修饰的变量值带的是形参，而不是成员变量。
    }

    public int getAge(){
        return age;
    }
//    public void setName(String b){
//        name = b;
//    }
    public void setName(String name){
//        name=name;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println(name+"---"+age);
    }
}
