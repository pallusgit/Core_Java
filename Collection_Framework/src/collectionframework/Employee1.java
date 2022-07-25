package collectionframework;

public class Employee1 {
	
	{
		int id;
		String name;
		String email;
		Float salary;
		
		public Employee1(int id, String name, String email, Float salary) {
			
			this.id = id;
			this.name = name;
			this.email = email;
			this.salary = salary;
		}
		public String toString()
		{
			String str="("+id+","+name+","+email+","+salary+")";
			return str;
		}
	}