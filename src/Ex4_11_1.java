import java.util.*;

class Ex4_11_1 {
	public static void main(String[] args) { 

		for(int i=1;i<=5;i++) {       //�ݺ��Ǵ� System.out.println("**********");�� ������ �� ��.
			for(int j=1;j<=10;j++) {  //�鿩����
				System.out.print("*");//���� for���� ���� ����, "**********"�� ������ �� ��. �� �ϳ��� �� �� ���.
			}						  //print ���η� ��� "**********", �ٹٲ� x
			System.out.println();     //System.out.print("*")���� ���η� ������ �����. �� �� �� �ٲ޸� ���ִ� ����.
		}	
	}
} 
