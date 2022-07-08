package InterThreadComuunication;

public class Ex {
	public static void main(String[] args) 
	{
		InterThreadCommunication obj=new InterThreadCommunication();
        producer p=new producer(obj);
        consumer c=new consumer(obj);       
        p.start();
        c.start();      
        try
        {
        	p.join();
        	c.join();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}

}