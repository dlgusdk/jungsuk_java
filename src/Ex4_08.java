class Ex4_08 {
	public static void main(String args[]) {
		//int i는 for문의 {}안에서만 사용 가능하다. 괄호 밖에서도 사용 가능하게 하려면 괄호 밖에 int i를 선언할 수, for문 안에 i를 할당한다.
		for (int i = 1; i <= 3; i++) { //for(초기화;조건식;증감식) {}으로 구성, 블럭{}안에는 true일 경우 실행될 문장이 들어감.
            //1부터 3까지 1씩 증가, 1이 조건식에 맞을(true) 경우 블럭의 문장을 수행하고 i값을 1 증가 시킨다 똑같이 2가 조건식에 맞을 경우 ~ 
			//변수가 두 개 이상인 경우 초기화를 ,로 구분하여 따로따로 선언한다. 증감식도 두 개씩 쓸 수 있다(두 변수의 타입이 같아야한다). ex) for (int i = 1,j=10; i <= 10; i++,j--) {}
			//1씩 증가가 아닌 2씩 할 때 - i=i+2, i+=2
			//초기화, 조건식, 증감식 모두 생략 가능. for (;;) {} 항상 참이 되어 무한 반복된다.
			System.out.println("Hello");
		}
	}
}