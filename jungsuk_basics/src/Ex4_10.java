class Ex4_10 {
	public static void main(String[] args) { 
		int sum = 0;	// sum 합계를 저장하기 위한 변수.

		/*sum = sum + 1; 0+1=1
		  sum = sum + 2; 1+2=3 
		  sum = sum + 3; 3+3=6
		  sum = sum + 4; 6+4=10
		  sum = sum + 5; 10+5=15  */
		
		for(int i=1; i <= 5; i++) {
			sum += i ;	// sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
		}
	} 
}