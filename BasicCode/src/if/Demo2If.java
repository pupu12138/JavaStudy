public class Demo2If {
	/*
		��ʽ��
			if (��ϵ���ʽ) {
				�����1;	
			} else {
				�����2;	
			}

			
		ִ�����̣�
		
			���ȼ����ϵ���ʽ��ֵ
			�����ϵ���ʽ��ֵΪtrue��ִ�������1
			�����ϵ���ʽ��ֵΪfalse��ִ�������2
			����ִ�к�����������
				
	*/
	public static void main(String[] args) {
		// �����ж�һ����, ����������ż��
		int num = 9;
		
		if(num % 2 == 0){
			System.out.println("ż��");
		}else{
			System.out.println("����");
		}
	}
}