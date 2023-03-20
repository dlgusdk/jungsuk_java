import java.util.*; //*대신 Scanner도 가능. *은 특정 패키지에 있는 모든 클래스를 사용 가능.

public class Ex2_06 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in); //scanner 객체 생성
		//scanner에 노란밑줄 나오는 이유: 입출력 관련 객체들은 사용 후 닫아줘야 하는데 화면 입력은 jvm에 의해 자동으로 관리하기 때문에 상관없음. 
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
				
		System.out.println(num);		
	}
}                      

