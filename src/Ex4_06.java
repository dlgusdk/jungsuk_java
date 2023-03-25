import java.util.Scanner;

class Ex4_06 {
	public static void main(String[] args) { 
		System.out.print("현재 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장

//		경우의 수가 많을 때 swich문을 쓴다. 하나의 조건식 안에 여러 case가 있다.
//		switch()안에는 정수나 문자열이 올 수 있다. if는 false와 true.
//		switch문은 항상 if문으로 바꿀 수 있다. 하지만 if문을 switch문으로 바꿀 때는 그렇지 않다. switch문의 제약조건 때문. 
//		switch문의 제약조건 - 1. 조건식의 결과는 정수 또는 문자열. 2. case문의 값은 정수, 상수(문자포함), 문자열만 가능. 중복 x
		switch(month) {
			case 3: 
			case 4: 
			case 5:
//			case 12: case 1: case 2: 라고 쓸 수도 있다.
				System.out.println("현재의 계절은 봄입니다.");
				break; //break문은 case문의 영역을 구별하는 역할. 없으면 swich문의 블럭 끝이 나올 때까지 모든 문장을 수행.
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default:  //swich문의 마지막. else와 같은 역할. 생략가능.
				System.out.println("현재의 계절은 겨울입니다.");
		}
	} 
}