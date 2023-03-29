class Ex4_13 {
	public static void main(String[] args) {
		int sum = 0;  
		int i = 0;
		
		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);  
			sum += ++i;   //sum값은 직전 식보다 1 증가한 i값 + 직전 식의 sum값. ++i, 전위이므로 계산하기 전에 i값을 1 증가.
	     // sum = sum + ++i;
		}
	} 
}