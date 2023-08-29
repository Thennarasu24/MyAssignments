package week3.day2;

public class Calculator {

	public void add(int a, int b) {
		
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		
		System.out.println(a + b + c);
	}

	public void multiple(double x, double y) {
		
		System.out.println(x * y);

	}

	public void multiple(float x, float y) {
		
		System.out.println(x * y);
	}

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.add(4, 6);
		calc.add(5, 6, 7);
		calc.multiple(1067675656, 11);
		calc.multiple(2.33 , 11.23 );
	}
}
