import java.util.*;  //Scanner

class Ex4_11 {
	public static void main(String[] args) { 

		for(int i=2;i<=9;i++) {     //������ 2~9�ܱ���. i�� 2�� �� ���ǽ� i<=9�� ���Ƿ� true. {}���� ���� ���� 
			for(int j=1;j<=9;j++) { //j�� 1�� �� ���ǽ� j<=9�� �����Ƿ� true. {}���� �� ����
				System.out.println(i+"*"+j+"="+(i*j)); //i= 2, j=1�� ������ �����ϰ� 1 ����. j�� 9�� ����ǰ� 10�� �Ǹ� false�� �Ǿ� �ٽ� i �Ǻ�.
			}
			System.out.println();
		}
	} 
}