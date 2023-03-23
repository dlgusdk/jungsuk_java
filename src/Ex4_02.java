class Ex4_02 {

	public static void main(String[] args) { 
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");

		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);

		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		//if(!(x!=0)
	    //   System.out.println("!(x!=0)"); 과 같다.
		//if문은 조건식과 괄호 안의 문장으로 이루어지지만 괄호 속 문장이 하나 뿐인 경우, 괄호를 생략할 수 있다.
		//괄호{}를 블럭이라고 한다.
	}
}
