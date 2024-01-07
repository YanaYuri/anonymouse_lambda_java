package Test1;

public class AnonymousProduct {
public static void main(String[] args) {

	new base(){
		@Override
		public void dispName(){
			System.out.println("This is ProductA");
	 }
	}.dispName();
}
}
