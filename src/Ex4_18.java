import java.util.*;

class Ex4_18 {
	public static void main(String[] args) { 
		int menu = 0;
		int num  = 0;

		Scanner scanner = new Scanner(System.in);

		while(true) { //���ѹݺ�
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>");   //�Է¹��� ��� �� �Է¹ޱ�

			String tmp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu = Integer.parseInt(tmp);    // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;  //0�̸� break. �ؿ� �ִ� �ĵ��� �����ϰ� ����.
			} else if (!(1 <= menu && menu <= 3)) {  //1~3�� �ƴ� �� ���� ����ϰ� continue. 
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;	 //�����ִ� �ݺ��� ���� �� �ٸ� �ݺ��� while�� {}������ ����.	
			}
			
			System.out.println("�����Ͻ� �޴��� "+ menu +"���Դϴ�."); //1~3 ������ ���� �Է����� �� if���� �´� ���� �����Ƿ�  ����� ����. break���� ���� ���ѹݺ��̹Ƿ� �ٽ� while�� �����. 
		}
	} }