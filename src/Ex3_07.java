class Ex3_07 {
	
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//3.141592���� 1000�� ���� �� - 3141.592
		//3141.592�� �Ҽ��� ù �ڸ� ������ �ݿø��ϴ� Math.round()�޼��� ��� - 3142
		//�� ���� 1000.0�� �����ָ� �ٽ� �Ǽ��� ����� - 3.142 int���� double������ ��ȯ
		
		System.out.println(shortPi);
	}
}