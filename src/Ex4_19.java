class Ex4_19
{
	public static void main(String[] args)
	{
      //break문은 하나의 반복문밖에 못 빠져나감. 중첩반복문을 벗어나고 싶을 때 반복문에 이름을 붙인다.
	  //1. 반복문에 이름을 붙인다.
		Loop1 : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5) //j가 5가 될 때까지 반복. i가 속한 for문은 j가 속한 for문 밖에 있기 때문에 j값만 상승. 
						break Loop1; //2. break문에 어디까지 빠져나갈건지 지정해주기 위해 반복문의 이름을 붙여준다. 형식 - break 빠져나가고자하는 반복문이름
//						break;
//						continue Loop1;
//						continue;  
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i. 그냥 break;를 실행했을 때 도달하는 곳
				System.out.println();
		} // end of Loop1. break Loop1;을 실행했을 때 도달하는 곳

	}
}