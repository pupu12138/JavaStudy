package dyadicArray;

/**
 * @author WYZ
 * @creat 2021-06-02 9:16
 * ��ά�����ʽ����������[][] ������ = new ��������[��漸��][һ������漸��]
 */
public class dyadicARRAY1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr);
   /*    [[I@6f496d9f
          [[��ʾ��ά����
          I��ʲ��������
          @�ָ���
          6f496d9f�ڴ��ַ
   */
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        /*  [I@723279cf
            [I@10f87f48
            [I@b4c966a
            ��Ķ���һά������ڴ��ַ
        */
        System.out.println(arr[0][0]);
        arr[0][1]=13;
        System.out.println(arr[0][1]);
        // ��ӡ�ڼ��������еĵڼ���Ԫ��
    }
}
