import java.util.Scanner;

public class Test {
	/*
		���󣺼���¼��ѧ�����Գɼ�, ���ݳɼ����������ͬ�Ľ�����
		
			95~100�� : ���г�һ��
			90~94��  : ���ֳ�һ��
			80~89��	 : ���ν��һ��
			80������ : ������, ���������ֶ���һ�����ĵ���~

		����:
				1. ʹ��Scanner¼�뿼�Գɼ�
				2. �жϳɼ��Ƿ��ںϷ���Χ�� 0~100
					�Ƿ��Ļ�, ����������ʾ
				3. �ںϷ����������жϳɼ���Χ������һ������
					��������Ӧ�Ľ���.
		
	*/
	public static void main(String[] args){
		// 1. ʹ��Scanner¼�뿼�Գɼ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ĳɼ�:");
		int score = sc.nextInt();
		// 2. �жϳɼ��Ƿ��ںϷ���Χ�� 0~100
		if(score >=0 && score <= 100){
			// �Ϸ��ɼ�
			// 3. �ںϷ����������жϳɼ���Χ������һ������
			if(score >= 95 && score <= 100){
				System.out.println("���г�һ��");
			}else if(score >= 90 && score <= 94){
				System.out.println("���ֳ�һ��");
			}else if(score >= 80 && score <= 89){
				System.out.println("���ν��һ��");
			}else {
				System.out.println("������, ���������ֶ���һ�����ĵ���~");
			}
		}else{
			// �Ƿ��Ļ�, ����������ʾ
			System.out.println("���ĳɼ���������!");
		}
	}
}