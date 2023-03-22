class Ex3_03 {
	
	public static void main(String[] args) {
		int i = -10;   //-는 피연산자의 부호를 반대로 변경
		i = +i;  //-는 피연산자의 부호를 반대로 변경
		System.out.println(i);

		i = -10;
		i = -i;
		System.out.println(i);
	}
}