
public class Stringhandlingdemo {

	public static void main(String[] args) {
		String S1= "Dr.Ait";
		System.out.println("The length of S1 id :" +S1.length());
		System.out.println("The indexOf T is ;" +S1.indexOf('T'));
		
		String S2 = "Monday";
		String S3=S2.substring(3,6);
		String S8=S2.substring(3);
		System.out.println(S8);
		
		String S4="       hi        ";
		String S5= S4.trim();
		System.out.println(S5);
		
		String sentence = "Hi Welcome to Java Class";
		char ch[]= sentence.toCharArray();

		for (int i=0;i<sentence.length();i++)
				{
			System.out.println(ch[i]);
				}
		System.out.println(sentence.length());
		String S6="Java";
		System.out.println(S6);
		String S7 = S6.toUpperCase();
		System.out.println(S7);
		
			
		}
		
	
		
		// TODO Auto-generated method stub

	}

