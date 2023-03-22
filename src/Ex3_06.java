class Ex3_06 {
	
	public static void main(String args[]) { 
		int a = 1_000_000;    // 1,000,000   1백만  10의 6제곱
		int b = 2_000_000;    // 2,000,000   2백만  10의 6제곱

		long c = a * b;       // a * b = 2,000,000,000,000 ? - 오버플로우
		                      //결과는 10의 12제곱, int 범위는 10의 9제곱.
		                      //a*b에서 오버플로우가 발생하며 int형으로 저장됨. a나 b에 (long)형변환을 해줘 범위를 넘지않도록 한다.
      
		System.out.println(c);
	}
}