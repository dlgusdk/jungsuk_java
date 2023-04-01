import java.util.*;

class Ex4_20 {
	public static void main(String[] args) { 
		int menu = 0, num  = 0;
		Scanner scanner = new Scanner(System.in);

		outer:   // while문에 outer라는 이름을 붙인다. 
		while(true) {  //outer : while(true) {}와 같음. 무한반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>"); //입력문구 출력 

			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

			if(menu==0) {  
				break; //0이면 밑의 식들을 모두 무시하고 while문을 빠져나가 종료.
			} else if (!(1<= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue; //1~3 사이의 값이 아니라면 if를 빠져나가 while의 {}끝 부분으로 이동. while 재실행.		
			}

			for(;;) { //무한반복. for(;true;) { 와 같음. true 생략 가능.
		      System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
				tmp = scanner.nextLine();    // for문 안의 변수 tmp와 while문의 변수 tmp는 다름.   
				num = Integer.parseInt(tmp); // 변수는 변수가 속한 {}안에서만 적용된다. 

				if(num==0)  
					break;        // 0일 때 계산 종료. for문을 벗어난다.

				if(num==99) 
					break outer;  // 99일 떄 전체 종료. for문과 while문을 모두 벗어난다.

				switch(menu) {
					case 1: 
						System.out.println("result="+ num*num);		
						break;
					case 2: 
						System.out.println("result="+ Math.sqrt(num)); //Math.sqrt()제곱근 구하는 식
						break;
					case 3: 
						System.out.println("result="+ Math.log(num));  //Math.log()로그 구하는 식
						break;
				} //switch문 속 break문 적용 위치
			} // for(;;)끝. for문 속 if(num==0)일 때 break 적용 위치.
		} // while의 끝. while문 속 if -else if문의 continue 적용 위치.for문 속 if(num==99)일 때 break outer 적용 위치.
		System.out.println("프로그램을 종료합니다.");
	} //while문 속 if(menu==0)일 때 break 적용 위치.
}