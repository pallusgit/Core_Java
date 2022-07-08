package thread;

public class ThreadClass extends Thread
{
	int st;
	String message;
	public static void main(String[] args)
	{
		this.st=st;
		this.message=message;
		public void run()
		{
			for (int i=0;i<10;i++)
			{
				try
				{
					Thread.sleep(st);;
					
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
				System.out.println(message +1);
				}
		}
	}
				
			
					
		
	
	


