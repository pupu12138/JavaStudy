package whiletest;

/**
 * @author WYZ
 * @creat 2021-05-14 18:47
 */
public class demo1 {
    public static void main(String[] args) {
        int count=0;//����һ��������������
        double paper = 0.1;//����ֽ�ű���
        int zf=8844430;//����������������
        while (paper<=zf){
            //�ж�������paper<=zf
            paper *=2;//paper��ȳ���2
            count++;//ÿ�γ�2���������һ;
        }
        System.out.println(count);
    }
}
