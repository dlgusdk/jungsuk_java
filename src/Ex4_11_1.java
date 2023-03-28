import java.util.*;

class Ex4_11_1 {
	public static void main(String[] args) { 

		for(int i=1;i<=5;i++) {       //반복되는 System.out.println("**********");을 간단히 한 것.
			for(int j=1;j<=10;j++) {  //들여쓰기
				System.out.print("*");//이중 for문은 별의 갯수, "**********"를 간단히 한 것. 별 하나를 열 번 찍기.
			}						  //print 가로로 출력 "**********", 줄바꿈 x
			System.out.println();     //System.out.print("*")에서 가로로 열개를 찍어줌. 그 후 줄 바꿈만 해주는 역할.
		}	
	}
} 
