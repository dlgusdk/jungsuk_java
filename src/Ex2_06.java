import java.util.*; //*��� Scanner�� ����. *�� Ư�� ��Ű���� �ִ� ��� Ŭ������ ��� ����.

public class Ex2_06 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in); //scanner ��ü ����
		//scanner�� ������� ������ ����: ����� ���� ��ü���� ��� �� �ݾ���� �ϴµ� ȭ�� �Է��� jvm�� ���� �ڵ����� �����ϱ� ������ �������. 
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
				
		System.out.println(num);		
	}
}                      

