class Ex3_02 {
	
	public static void main(String args[]) {
		int i= 5, j = 7;
		
		j = i++;  //������
		//J = i;
		//i++;
		System.out.println("j = i++; ���� ��, i =" + i + ", j =" + j );
		
		i = 5;
		j = 0;
		
		j = ++i; //������
		System.out.println("j = ++i; ���� ��, i =" + i + ", j =" + j);
		
	}
}