public class Ex2_03 {

	public static void main(String[] args) {

		final int score = 100;  //상수값은 변경 x
		//score = 200;
		boolean power = false; //false, true

		byte b = 127; // -128~127

		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; //16진수, 10진수로 16

		long l = 10_000_000_000L;

		float f = 3.14f;
		double d = 3.14f; //d 생략가능 리터럴과 변수타입이 같지않지만 d가 f보다 범위가 넓어 사용 가능

		//System.out.println(oct);
		//System.out.println(hex);
		char ch = 'A';
		int i = 'A';//A의 문자코드로 출력

		String str = ""; //빈문자열(empty string) 
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2+str3;

		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);

		System.out.println(str4);
	}                      

}
