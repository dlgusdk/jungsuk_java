import java.util.Scanner;

class Ex4_06 {
	public static void main(String[] args) { 
		System.out.print("���� ���� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();  // ȭ���� ���� �Է¹��� ���ڸ� month�� ����

//		����� ���� ���� �� swich���� ����. �ϳ��� ���ǽ� �ȿ� ���� case�� �ִ�.
//		switch()�ȿ��� ������ ���ڿ��� �� �� �ִ�. if�� false�� true.
//		switch���� �׻� if������ �ٲ� �� �ִ�. ������ if���� switch������ �ٲ� ���� �׷��� �ʴ�. switch���� �������� ����. 
//		switch���� �������� - 1. ���ǽ��� ����� ���� �Ǵ� ���ڿ�. 2. case���� ���� ����, ���(��������), ���ڿ��� ����. �ߺ� x
		switch(month) {
			case 3: 
			case 4: 
			case 5:
//			case 12: case 1: case 2: ��� �� ���� �ִ�.
				System.out.println("������ ������ ���Դϴ�.");
				break; //break���� case���� ������ �����ϴ� ����. ������ swich���� �� ���� ���� ������ ��� ������ ����.
			case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			default:  //swich���� ������. else�� ���� ����. ��������.
				System.out.println("������ ������ �ܿ��Դϴ�.");
		}
	} 
}