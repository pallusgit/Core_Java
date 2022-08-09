package generics;

public class GenericConstructor {
private double v;
public <T extends Number>GenericConstructor(T t)
{
	v=t.doubleValue();
}

void show()
{
	System.out.println("Valu of v is: "+v);
}
public static void main(String[] args) {
	  System.out.println("Number to Double Conversion:");
	  GenericConstructor obj=new GenericConstructor(10);
	  obj.show();

	  GenericConstructor obj1=new GenericConstructor(136.8F);
	  obj1.show();
	}

}