package methodTest1;

/**
 * @author WYZ
 * @creat 2021-05-20 18:15
 */
public class methodReloadPassTest2 {
    public static void main(String[] args) {
        /*
            �����������ݵ�����Ϊ�������ͣ�
            ���뷽���е��Ǿ�������ݡ�
        */
        int number = 100;
        System.out.println("����change����ǰ"+number);
        change(number);
        System.out.println("����change������"+number);//������Ϊ��100
    }
    public static void change (int number){
         number = 200;
    }
}
