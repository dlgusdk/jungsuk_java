class Ex4_16 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;

		while(true) {  //계속 true이므로 무한 반복. for(;;) {}과 같은 의미. 다만, while은 true생략 불가.
			if(sum > 100)
				break; //특정조건을 만족할 때 자신이 포함된 가장 가까운 반복문을 벗어남.
			++i;       //break문으로 인해 반복문을 벗어나면 여기부터는 실행x.
			sum += i;  //++i;와 sum += i;은 sum += ++i;로 적을 수 있다.
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}