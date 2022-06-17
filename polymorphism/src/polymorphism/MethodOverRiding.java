package polymorphism;

class Bank {
	float getRateOfInterst() {
		return 6.77f;
	}
}

class SBI extends Bank {

	@Override
	float getRateOfInterst() {
		// TODO Auto-generated method stub
		return 6.87f;
	}

}

class HDFC extends Bank {

	@Override
	float getRateOfInterst() {
		// TODO Auto-generated method stub
		return 6.57f;
	}

}

class ICICI extends Bank {

	@Override
	float getRateOfInterst() {
		// TODO Auto-generated method stub
		return 6.97f;
	}

}

public class MethodOverRiding {

	public static void main(String[] args) {
		SBI obj = new SBI();
		System.out.println(obj.getRateOfInterest());
		Bank obj1 = new HDFC();
		System.out.println(obj1.getRateInterst());
	}

}
