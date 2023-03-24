import java.util.Scanner;

class Ex4_04 {
	public static void main(String[] args) { 
		int score  = 0;   
		char grade = ' ';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

		if (score >= 90) {         
			 grade = 'A';             
		} else if (score >=80) {   //80점 이상, 90점 미만이라고 써야하지만 score>=80이라고 쓸 수 있는 이유는 score >= 90이 위 조건식에서 이미 판별되었으므로 가능한 것.
			 grade = 'B'; 
		} else if (score >=70) {   
			 grade = 'C'; 
		} else {                   // if- else if문은 거의 else블럭으로 끝난다.  
			 grade = 'D';          // 경우의 수가 세 개 이상일 때 사용하며 if- else if문 전체가 한 묶음이기 때문에 조건식 중 딱 하나만 실행하고 빠져나온다.
		
			 //else블럭은 생략가능. char grade = ' ';를 char grade = 'D';로 초기화하면 if- else if문에서 맞는 조건식이 없을 때 마지막 else의 조건식이 없어도 D가 나온다.
		}
		
	
		System.out.println("당신의 학점은 "+ grade +"입니다.");
	}
}