package exceptionhandling;

public class TestTryCatch1 {

	public static void main(String[] args) {
		try
		{
	int data = 50/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}

}
