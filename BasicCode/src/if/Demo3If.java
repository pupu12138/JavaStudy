public class Demo3If {
	/*
		��ʽ��
			if (�ж�����1) {
				�����1;	
			} else if (�ж�����2) {
				�����2;	
			} 
			��
			else {
				�����n+1;
			}
			
		ִ�����̣�
			���ȼ����ж�����1��ֵ
			���ֵΪtrue��ִ�������1�����ֵΪfalse�ͼ����ж�����2��ֵ
			���ֵΪtrue��ִ�������2�����ֵΪfalse�ͼ����ж�����3��ֵ
			��
			���û���κ��ж�����Ϊtrue����ִ�������n+1��
			
		����:
			����ѧ���ɼ�, ���������Ӧ����
			
			90~100
				����
			80~89
				����
			70~79
				�е�
			60~69
				����
			0~59
				��Ŭ������!
			
	*/
	public static void main(String[] args){
		int score = -1;
		
		if(score >= 90 && score <= 100){
			System.out.println("����");
		}else if (score >= 80 && score <= 89){
			System.out.println("����");
		}else if (score >= 70 && score <= 79){
			System.out.println("�е�");
		}else if (score >= 60 && score <= 69){
			System.out.println("����");
		}else if (score >= 0 && score <= 59){
			System.out.println("��Ŭ������");
		}else{
			System.out.println("�ɼ�����!");
		}
	}
}







