package JavaPractices;

public class UseOfThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseOfThrow useofthrow = new UseOfThrow();
		System.out.println(useofthrow.div(10,0));
		
	}
	public int div(int num1, int num2) {
		if(num2==0) {
			throw new ArithmeticException("please do not try divide by zero");
		}
		int result=num1/num2;
		return result;
	} 
}
