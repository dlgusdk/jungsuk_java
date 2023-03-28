import java.util.*;  //Scanner

class Ex4_11 {
	public static void main(String[] args) { 

		for(int i=2;i<=9;i++) {     //구구단 2~9단까지. i가 2일 때 조건식 i<=9에 들어가므로 true. {}안의 식을 실행 
			for(int j=1;j<=9;j++) { //j가 1일 때 조건식 j<=9에 맞으므로 true. {}안의 식 실행
				System.out.println(i+"*"+j+"="+(i*j)); //i= 2, j=1을 대입해 실행하고 1 증가. j가 9번 실행되고 10이 되면 false가 되어 다시 i 판별.
			}
			System.out.println();
		}
	} 
}