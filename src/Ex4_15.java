import java.util.*;

class Ex4_15 {
	public static void main(String[] args) { 
		int input  = 0, answer = 0;

		answer = (int)(Math.random() * 100) + 1; // 1~100 ������ ������ ���� ����, (0.0*100 <= Math.random()*100 <1.0*100)+1
		Scanner scanner = new Scanner(System.in);

		do {   //do-while�� while�� �޸� �ּ��� �� ���� ����Ǿ���Ѵ�. while�� ���ǽ��� true�̸� do{}���� ���� �ݺ��ϰ� false�� ����������. 
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();

			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");	
			} else if(input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");			
			}
		} while(input!=answer); 
	/* 	 do-while�� while�� ��ȯ, �Էºκ��� {}������ ���� do�� while������ ���� 
	     System.out.print("1�� 100������ ������ �Է��ϼ���.>");
	     input = scanner.nextInt();
		
		 while(input!=answer) {}  */

		System.out.println("�����Դϴ�.");
	}
}