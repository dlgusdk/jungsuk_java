class Ex4_07 {
	public static void main(String args[]) {
		int num = 0;

		// ��ȣ{} ���� ������ 20�� �ݺ��Ѵ�. 1~6 ������ ���� 5�� ���.
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			//Math.random()�޼��� �� ����(������ ��)�� ��� ���� ���. 0.0���� 1.0 ������ double���� ��ȯ.(1.0�� ������)  
			//(Math.random() * 6) + 1 Ǯ��
			//0.0 * 6 <= Math.random * 6 < 1.0 * 6
			//int�� ����ȯ�Ǿ� 0<= Math.random * 6 < 6
			//+1�� �� 1<= Math.random * 6 < 7
			System.out.println(num);
		}
	}
}