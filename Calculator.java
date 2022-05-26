
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
		
	}
	
	public int divide(int a, int b) {
		if (a/b == 1) {
			throw new IllegalArgumentException();
		}
		
		return a / b;
	}
}
