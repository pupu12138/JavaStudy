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
            System.out.println("����ɷ��");
        }else{
            age=a;
        }
    }
    public int getAge(){
        return age;
    }
//    int age;
//    private�ؼ��֣�������Ա������������ʹ�ã��ṩset get���÷�����
    public void out(){
        System.out.println(name+","+age);
    }
}
