class Ex3_09 {

	public static void main(String args[]) { 
		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x의 값이 음수이면, 양수로 만든다. x가 0과 같거나크면(true) x, 아니면(false) -x
		absY = y >= 0 ? y : -y;  
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 조건 연산자를 중첩. 순서에 따라 괄호부터 처리. x가 0과 같으면  ' ', 아니면 '-'. 결과값은 또 다른 조건 연산자가 됨. x > 0 ? '+' : '-'
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 

		System.out.printf("x=%c%d%n", signX, absX); 
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}
}