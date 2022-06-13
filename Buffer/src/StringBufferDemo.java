
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("C++");
		System.out.println("Length" +sb.length());
		System.out.println("Capacity" +sb.capacity());
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'J');
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("India");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		StringBuffer sb2=new StringBuffer("Java Programming");
		System.out.println(sb2);
		sb2.replace(0, 4, "C");
		System.out.println(sb2);
		
		// TODO Auto-generated method stub

	}

}
