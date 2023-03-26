class Ex4_07 {
	public static void main(String args[]) {
		int num = 0;

		// 괄호{} 안의 내용을 20번 반복한다. 1~6 사이의 난수 5개 출력.
		// 만약 -5~5 처럼 음수가 있는 범위를 표현할 때는 꼭 0을 포함해야한다. 
		//-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 System.out.println((int)(Math.random() * 11)-5); //-5<=x<6
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1;
			//Math.random()메서드 는 난수(임의의 수)를 얻기 위해 사용. 0.0에서 1.0 사이의 double값을 반환.(1.0은 미포함)  
			//(Math.random() * 6) + 1 풀이
			//0.0 * 6 <= Math.random * 6 < 1.0 * 6
			//int로 형변환되어 0<= Math.random * 6 < 6
			//+1을 해 1<= Math.random * 6 < 7
			System.out.println(num);
			//System.out.println((int)(Math.random() * 6) + 1);
		}
	}
}
