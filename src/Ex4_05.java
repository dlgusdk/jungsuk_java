import java.util.Scanner;

class Ex4_05 {
	public static void main(String[] args) { 
		int  score = 0;
		char grade = ' ', opt = '0';

		System.out.print("������ �Է����ּ���.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();  

		System.out.printf("����� ������ %d�Դϴ�.%n", score);

		if (score >= 90) {           //90�� �̻��̰ų� ������ A
			grade = 'A';
			if (score >= 98) {       //if�� �ȿ� �� �ٸ� if���� �ִ� ��ø if��. 90�� �̻� �� 98�� �̻��̰ų� ������ A+  
				opt = '+';	
			} else if (score < 94) {  //94�� �̸��� A- 
				opt = '-';
			}
		} else if (score >= 80){      //80�� �̻��̰ų� ������ B. 90�� ���������� �̹� �� ���ǽĿ��� �Ǻ��Ǿ��⿡ 80���̻� 90�� �̸����� ����.
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84)	{
				opt = '-';
			}
		} else {                     // �������� C����(grade)
			grade = 'C';             //�ʱ�ȭ �� char grade = 'C'�� ����.
		}	
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
	}
}