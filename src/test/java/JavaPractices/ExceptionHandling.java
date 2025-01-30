package JavaPractices;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ExceptionHandling exceptionHandling = new ExceptionHandling();
   int result = exceptionHandling.div(10,2);
   System.out.println("Division Result:"+result);
	}
public int div(int num1,int num2) {

	int result =0;
	try {
		result= num1/num2;
		String s=null;
		s.length();
	} catch(ArithmeticException e) {
		System.out.println("Please do not try to divide by Zero ");
	}
	//catch(Exception a) {
		//System.out.println("Please do not try to divide by Zero ");
	//}
	finally{
		System.out.println("Finally block always executed!!!");
	}
	
	System.out.println("After getting exception");
	return result;
}

}

