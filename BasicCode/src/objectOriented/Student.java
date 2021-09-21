package objectOriented;

import javax.naming.Name;

/**
 * @author WYZ
 * @creat 2021-06-03 10:11
 */
public class Student {
    String name;
    private int age;
    public void setAge(int a){
//        age=a;
        if (a<0 || a>100){
            System.out.println("你是煞笔");
        }else{
            age=a;
        }
    }
    public int getAge(){
        return age;
    }
//    int age;
//    private关键字，保护成员不被其他的类使用，提供set get等用法调用
    public void out(){
        System.out.println(name+","+age);
    }
}
