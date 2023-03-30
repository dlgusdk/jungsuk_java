import java.util.*;

class Ex4_15 {
	public static void main(String[] args) { 
		int input  = 0, answer = 0;

		answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 임의의 수를 저장, (0.0*100 <= Math.random()*100 <1.0*100)+1
		Scanner scanner = new Scanner(System.in);

		do {   //do-while은 while과 달리 최소한 한 번은 수행되어야한다. while의 조건식이 true이면 do{}안의 식을 반복하고 false면 빠져나간다. 
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();

			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");	
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");			
			}
		} while(input!=answer); 
	/* 	 do-while을 while로 변환, 입력부분을 {}밖으로 빼고 do를 while문으로 변경 
	     System.out.print("1과 100사이의 정수를 입력하세요.>");
	     input = scanner.nextInt();
		
		 while(input!=answer) {}  */

		System.out.println("정답입니다.");
	}
}