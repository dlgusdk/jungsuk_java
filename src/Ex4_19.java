class Ex4_19
{
	public static void main(String[] args)
	{
      //break���� �ϳ��� �ݺ����ۿ� �� ��������. ��ø�ݺ����� ����� ���� �� �ݺ����� �̸��� ���δ�.
	  //1. �ݺ����� �̸��� ���δ�.
		Loop1 : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5) //j�� 5�� �� ������ �ݺ�. i�� ���� for���� j�� ���� for�� �ۿ� �ֱ� ������ j���� ���. 
						break Loop1; //2. break���� ������ ������������ �������ֱ� ���� �ݺ����� �̸��� �ٿ��ش�. ���� - break �������������ϴ� �ݺ����̸�
//						break;
//						continue Loop1;
//						continue;  
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i. �׳� break;�� �������� �� �����ϴ� ��
				System.out.println();
		} // end of Loop1. break Loop1;�� �������� �� �����ϴ� ��

	}
}