class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) {  //��� true�̹Ƿ� ���� �ݺ�. for(;;) {}�� ���� �ǹ�. �ٸ�, while�� true���� �Ұ�.
			if(sum > 100)
				break; //Ư�������� ������ �� �ڽ��� ���Ե� ���� ����� �ݺ����� ���.
			++i;       //break������ ���� �ݺ����� ����� ������ʹ� ����x.
			sum += i;  //++i;�� sum += i;�� sum += ++i;�� ���� �� �ִ�.
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}