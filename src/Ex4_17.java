class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue;   //if문 조건식이 참이고 coutinue문을 만나면 반복ㅁ누을 벗어나지 않고 다음 반복으로 건너뜀. 속해 있는 반복문의 끝{}으로 이동함.
			System.out.println(i);
		} //if (i%3==0)이 참이면 여기로 건너뛰어서 다시 for문으로 돌아감
	}
}
