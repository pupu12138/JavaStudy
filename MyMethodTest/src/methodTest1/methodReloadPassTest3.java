package methodTest1;

/**
 * @author WYZ
 * @creat 2021-05-20 18:28
 *
 *             �����������ݵ�����Ϊ�������ͣ�
 *             ��������Ϊ�����ַ��
 */
public class methodReloadPassTest3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println(arr[1]);
        change(arr);//�˴����ú�Ϊ�޸ĺ������Ԫ��
        System.out.println(arr[1]);

    }public static void change(int[] arr){
        /*�˴������Ϊ����ĵ�ַ*/
        arr[1]=200;
    }
}
