package langge.algorithm;

/**
 * 循环顺序(数组)队列
 * @author langge
 *
 */
public class ArrayQueueByLoop {

	private int max = 1;
	private String items[];
	
	private int heard = 0;
	private int tail = 0;
	
	private int size = 0;
	
	public ArrayQueueByLoop(int max) {
		items = new String[max];
		this.max = max;
	}
	
	//入队
	public boolean enqueue(String item){
		if (max<=0) {
			return false;
		}				
		
		/**方法一，使用了max-1个位置，留了一个空位置，因为判断队满对空不能都用heard==tail**/
//		if ((tail+1)%max == heard) {			
//			return false;//队满了
//		}
//		items[tail] = item;
//		System.out.println("enqueue tail="+tail+",item="+item);
//		tail = (tail+1)%max;		
//		return true;
		
		/**方法二，max个位置都使用, 队满队空，用当前队列大小size来判断**/
		if (size==max) {
			return false;//队满了
		}
		items[tail] = item;
		System.out.println("enqueue tail="+tail+",item="+item);
		tail++;
		size++;
		return true;
	}
	
	//出队
	public String dequeue(){		
		if (max<=0) {
			return null;
		}
		/**方法一**/
//		heard = heard%max;
//		if (heard==tail) {			
//			return null; //队空了
//		}
//		String retString = items[heard];
//		System.out.println("dequeue heard="+heard+",item="+retString);
//		heard++;
//		return retString;
		
		/**方法二**/
		if (size==0) {
			return null; //队空了
		}
		String retString = items[heard];
		System.out.println("dequeue heard="+heard+",item="+retString);
		heard++;
		size--;
		return retString;
	}
	
	

}
