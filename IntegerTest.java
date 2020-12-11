package ggg;

public class IntegerTest {
	static char[] array = { '1', '2', '3', '4' };
	static int[] T=new int[4];
	static int K;
	static String str="12345678";
	static MyInteger inte= new MyInteger(3);
	public static void main(String[] args) {
		T=inte.parseInt(array);
		K=inte.parseInt(str);
		System.out.println(K);
		for(int i=0;i<array.length;i++) {
		System.out.println(T[i]);
		}

	}

}
