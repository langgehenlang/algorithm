package langge.algorithm;

public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hahahah");
		
		int max = 10;
		ArrayQueueByLoop arrayQueueByLoop = new ArrayQueueByLoop(max);
		
		for (int value = 101; value < 112; value++) {
			arrayQueueByLoop.enqueue(value+"");	
		}		
		
		for (int i = 0; i < max; i++) {
			arrayQueueByLoop.dequeue();			
		}
		
	}

}
