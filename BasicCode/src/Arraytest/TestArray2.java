package Arraytest;

/**
 * @author WYZ
 * @creat 2021-05-18 20:41
 * ��ȡ�������ֵ
 *       1.����һ�����������洢���ֵ
 *       2.ȡ�����е�һ��λ����Ϊ�����ĳ�ʼֵ
 *       3.��������ʣ����������Ա�
 */
public class TestArray2 {
    public static void main(String[] args) {
        int[] arr={11,123,14,56,17,29,90};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max"+max);
    }
}
