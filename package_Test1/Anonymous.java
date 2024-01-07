package Test1;

public class Anonymous {
	public static void main(String[] args) {

		int x = new Object() {
			public int f(int a, int b) {
				return a + b;
			}
		}.f(3, 5);

		System.out.println(x);
	}

}
