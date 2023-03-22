class Ex3_07 {
	
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//3.141592에서 1000을 곱한 값 - 3141.592
		//3141.592에 소수점 첫 자리 수에서 반올림하는 Math.round()메서드 사용 - 3142
		//윗 값에 1000.0을 나눠주며 다시 실수로 만든다 - 3.142 int에서 double형으로 변환
		
		System.out.println(shortPi);
	}
}