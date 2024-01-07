package Test3;

import java.util.function.IntBinaryOperator;


public class LamdaMainBinaryOpe {
	public static void main(String[] args) {
		IntBinaryOperator i1 = (int a, int b)->{
			return a + b;
		};

		System.out.println(i1.applyAsInt(3, 5));
	}

}
