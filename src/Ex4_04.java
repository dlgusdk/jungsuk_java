import java.util.Scanner;

class Ex4_04 {
	public static void main(String[] args) { 
		int score  = 0;   
		char grade = ' ';  // ������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.

		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ����

		if (score >= 90) {         
			 grade = 'A';             
		} else if (score >=80) {   //80�� �̻�, 90�� �̸��̶�� ��������� score>=80�̶�� �� �� �ִ� ������ score >= 90�� �� ���ǽĿ��� �̹� �Ǻ��Ǿ����Ƿ� ������ ��.
			 grade = 'B'; 
		} else if (score >=70) {   
			 grade = 'C'; 
		} else {                   // if- else if���� ���� else������ ������.  
			 grade = 'D';          // ����� ���� �� �� �̻��� �� ����ϸ� if- else if�� ��ü�� �� �����̱� ������ ���ǽ� �� �� �ϳ��� �����ϰ� �������´�.
		
			 //else���� ��������. char grade = ' ';�� char grade = 'D';�� �ʱ�ȭ�ϸ� if- else if������ �´� ���ǽ��� ���� �� ������ else�� ���ǽ��� ��� D�� ���´�.
		}
		
	
		System.out.println("����� ������ "+ grade +"�Դϴ�.");
	}
}