public class Demo5For {
	/*
		�����ڿ���̨������е� ��ˮ�ɻ�����
		
				ˮ�ɻ�����һ����λ��
				ˮ�ɻ����ĸ�λ��ʮλ����λ�����������͵���ԭ��
	
		����:
			1. ͨ��ѭ����ȡ���е���λ��100-999
			2. ��ÿһ����λ�����Ϊ��λ, ʮλ, ��λ
			3. ����if�ж�����, �����Ƿ���ˮ�ɻ���, �ǵĻ������ӡ.
		
	*/
	public static void main(String[] args) {
		// 1. ͨ��ѭ����ȡ���е���λ��100-999
		for(int i = 100; i <= 999; i++){
			// 2. ��ÿһ����λ�����Ϊ��λ, ʮλ, ��λ
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			// int bai = i / 100;
			// 3. ����if�ж�����, �����Ƿ���ˮ�ɻ���, �ǵĻ������ӡ.
			if(	(ge*ge*ge + shi*shi*shi + bai*bai*bai) == i){
				System.out.println(i);
			}
		}
	}
}