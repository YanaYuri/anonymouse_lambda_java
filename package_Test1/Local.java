package Test1;

public class Local {
	public static void main(String[] args) {

		class LocalTest1{
			public int f(int a, int b) {
				return a + b;
			}
		}

		LocalTest1 l1 = new LocalTest1();  //instantation of local class
		System.out.println(l1.f(3, 5));

	}

}
