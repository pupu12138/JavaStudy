public class Demo6For {
	/*
		�����ڿ���̨������еġ�ˮ�ɻ�������Ҫ��ÿ�д�ӡ2��

		System.out.print (��ӡ����);	��ӡ�󲻻���
		System.out.println(��ӡ����);	��ӡ����

		����:
			
			1. �������count�����ڱ��桰��ӡ��������������ʼֵΪ0
			2. ���ж��ʹ�ӡˮ�ɻ����Ĺ����У�ƴ�ӿո�, �������У����ڴ�ӡ����count����+1����¼��ӡ��������
			3. ��ÿһ��count����+1���ж��Ƿ񵽴���2�ı������ǵĻ������С�

	*/
	public static void main(String[] args){
		// 1. �������count�����ڱ��桰��ӡ��������������ʼֵΪ0
		int count = 0;
		for(int i = 100; i <= 999; i++){
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			
			if(	(ge*ge*ge + shi*shi*shi + bai*bai*bai) == i){
				//  2. ���ж��ʹ�ӡˮ�ɻ����Ĺ����У�ƴ�ӿո�, �������У����ڴ�ӡ����count����+1����¼��ӡ��������
				System.out.print(i + " ");
				count++;
				// 3. ��ÿһ��count����+1���ж��Ƿ񵽴���2�ı������ǵĻ�������
				if(count % 2 == 0){
					System.out.println();
				}
			}
		}
	}
}