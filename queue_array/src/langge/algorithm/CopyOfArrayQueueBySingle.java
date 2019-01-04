package langge.algorithm;

/**
 * 简单的一次性队列
 * @author langge
 *
 */
public class CopyOfArrayQueueBySingle {

	private int max ;
	private String items[];
	
	private int heard;
	private int tail;
	
	public CopyOfArrayQueueBySingle(int max) {
		items = new String[max];
		this.max = max;
	}
	
	//入队
	public boolean enqueue(String item){
		if (tail==max) {
			//队尾了
			return false;
		}
		items[tail] = item;
		tail++;
		return true;
	}
	
	//出队
	public String dequeue(){		
		if (heard==tail) {
			//队空了
			return null;
		}
		String retString = items[heard];
		heard++;
		return retString;
	}
	
	

}
