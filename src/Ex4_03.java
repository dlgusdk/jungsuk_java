import java.util.Scanner; 

class Ex4_03 {
	public static void main(String[] args) {  
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); 

		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");	
		} else { // if(input!=0)�� ����
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
	} 
}