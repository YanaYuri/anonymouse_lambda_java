package Test3;

public class InterfaceAddMain {
	public static void main(String[] args) {
		AddTest i1 = (int a)->{
			return a + 5;
		};
		System.out.println(i1.f(10));
	}

}
