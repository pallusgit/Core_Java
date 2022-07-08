package InterThreadComuunication;

public class producer extends Thread{

	InterThreadCommunication obj;
		public producer (InterThreadCommunication obj) {
		this.obj=obj;
	}
	            
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int i = 0;
			while(true) {
				try {
					Thread.sleep(4000);	
				}
				catch(Exception e)
				{
					System.out.println(e);
					}
				obj.set(i);
				i++;
			}
		}