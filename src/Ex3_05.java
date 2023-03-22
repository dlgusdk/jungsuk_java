class Ex3_05 {
	
	public static void main(String args[]) { 
		int a = 10;
		int b = 4;

		System.out.printf("%d + %d = %d%n",  a, b, a + b);
		System.out.printf("%d - %d = %d%n",  a, b, a - b);
		System.out.printf("%d * %d = %d%n",  a, b, a * b);
		System.out.printf("%d / %d = %d%n",  a, b, a / b);
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / (float)b);
	    //타입 불일치로 int보다 큰 값인 float로 맞춰줌. 10.0 / 4.0
	
	}
}