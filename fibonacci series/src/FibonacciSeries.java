
public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 15, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n+ "terms:");
		for (int i= 1; i<=n; ++i) {
			System.out.print(firstTerm + secondTerm+ ",");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
			
		}
		// TODO Auto-generated method stub

	}

}
