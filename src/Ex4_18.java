import java.util.*;

class Ex4_18 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) { //무한반복
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");   //입력문구 출력 및 입력받기

			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;  //0이면 break. 밑에 있는 식들은 무시하고 종료.
			} else if (!(1 <= menu && menu <= 3)) {  //1~3이 아닐 때 문구 출력하고 continue. 
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;	 //속해있는 반복문 밖의 또 다른 반복문 while의 {}끝으로 간다.	
			}
			
			System.out.println("선택하신 메뉴는 "+ menu +"번입니다."); //1~3 사이의 값을 입력했을 떄 if문에 맞는 것이 없응므로  벗어나서 실행. break문이 없는 무한반복이므로 다시 while문 재실행. 
		}
	} }