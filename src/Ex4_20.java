import java.util.*;

class Ex4_20 {
	public static void main(String[] args) { 
		int menu = 0, num  = 0;
		Scanner scanner = new Scanner(System.in);

		outer:   // while���� outer��� �̸��� ���δ�. 
		while(true) {  //outer : while(true) {}�� ����. ���ѹݺ���
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����:0)>"); //�Է¹��� ��� 

			String tmp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu = Integer.parseInt(tmp);    // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

			if(menu==0) {  
				break; //0�̸� ���� �ĵ��� ��� �����ϰ� while���� �������� ����.
			} else if (!(1<= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue; //1~3 ������ ���� �ƴ϶�� if�� �������� while�� {}�� �κ����� �̵�. while �����.		
			}

			for(;;) { //���ѹݺ�. for(;true;) { �� ����. true ���� ����.
		      System.out.print("����� ���� �Է��ϼ���.(��� ����:0, ��ü ����:99)>");
				tmp = scanner.nextLine();    // for�� ���� ���� tmp�� while���� ���� tmp�� �ٸ�.   
				num = Integer.parseInt(tmp); // ������ ������ ���� {}�ȿ����� ����ȴ�. 

				if(num==0)  
					break;        // 0�� �� ��� ����. for���� �����.

				if(num==99) 
					break outer;  // 99�� �� ��ü ����. for���� while���� ��� �����.

				switch(menu) {
					case 1: 
						System.out.println("result="+ num*num);		
						break;
					case 2: 
						System.out.println("result="+ Math.sqrt(num)); //Math.sqrt()������ ���ϴ� ��
						break;
					case 3: 
						System.out.println("result="+ Math.log(num));  //Math.log()�α� ���ϴ� ��
						break;
				} //switch�� �� break�� ���� ��ġ
			} // for(;;)��. for�� �� if(num==0)�� �� break ���� ��ġ.
		} // while�� ��. while�� �� if -else if���� continue ���� ��ġ.for�� �� if(num==99)�� �� break outer ���� ��ġ.
		System.out.println("���α׷��� �����մϴ�.");
	} //while�� �� if(menu==0)�� �� break ���� ��ġ.
}