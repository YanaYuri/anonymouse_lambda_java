package Test3;

public class InterfaceBinaryMain {
	public static void main(String[] args) {
		TestBinary test = new TestBinary(){
				public int inttest(int a, int b){
				return a + b;
		 }
		};

		System.out.println(test.inttest(3,5));
	}
	}
