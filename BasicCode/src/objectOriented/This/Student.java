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
//        this���εı���ָ�����ǳ�Ա������
//        �������β�����ͳ�Ա����ͬ��������this���εı���ֵ�������βΣ������ǳ�Ա������
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
