import java.util.Scanner;

class Ex4_05 {
	public static void main(String[] args) { 
		int  score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력해주세요.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();  

		System.out.printf("당신의 점수는 %d입니다.%n", score);

		if (score >= 90) {           //90점 이상이거나 같으면 A
			grade = 'A';
			if (score >= 98) {       //if문 안에 또 다른 if문이 있는 중첩 if문. 90점 이상 중 98점 이상이거나 같으면 A+  
				opt = '+';	
			} else if (score < 94) {  //94점 미만은 A- 
				opt = '-';
			}
		} else if (score >= 80){      //80점 이상이거나 같으면 B. 90도 포함이지만 이미 위 조건식에서 판별되었기에 80점이상 90점 미만으로 본다.
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84)	{
				opt = '-';
			}
		} else {                     // 나머지는 C학점(grade)
			grade = 'C';             //초기화 값 char grade = 'C'와 같음.
		}	
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}