package Test1;

public class AnonymousProduct2 {
public static void main(String[] args) {

	base producta = new base(){
		@Override
		public void dispName(){
			System.out.println("This is ProductA");
	 }
	};
	producta.dispName();
}
}
