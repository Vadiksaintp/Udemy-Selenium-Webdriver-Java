package Section07;


public class L21b_ThreadImplements implements Runnable {
	
	public static void main(String[] args) {

		L21b_ThreadImplements thread = new L21b_ThreadImplements();
		Thread threadObject = new Thread(thread);
		threadObject.start();
		
		
		System.out.println("Outside of a thread");
		
	}
	
		public void run() {
			System.out.println("Inside of a thread");
		}
	
}