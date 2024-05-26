package Queue;
 
public class Test {
 
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);
		queue.enqueue(2);
		queue.enqueue(5);
		queue.dequeue();
		queue.display();
		queue.front();
	}
 
}