public class Ex2_03 {

	public static void main(String[] args) {

		final int score = 100;  //������� ���� x
		//score = 200;
		boolean power = false; //false, true

		byte b = 127; // -128~127

		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; //16����, 10������ 16

		long l = 10_000_000_000L;

		float f = 3.14f;
		double d = 3.14f; //d �������� ���ͷ��� ����Ÿ���� ���������� d�� f���� ������ �о� ��� ����

		//System.out.println(oct);
		//System.out.println(hex);
		char ch = 'A';
		int i = 'A';//A�� �����ڵ�� ���

		String str = ""; //���ڿ�(empty string) 
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2+str3;

		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);

		System.out.println(str4);
	}                      

}
