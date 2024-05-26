package Queue;

public class ArrayQueue {
    private static int capacity; 
    private static int front;
    private static int rear;
    private static int[] queue;
 
    
    public ArrayQueue(int capacity) {
        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;
        this.queue = new int[capacity];
    }
    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return front == rear;
    }
 
    /**
     * Checks if the queue is full.
     * @return true if the queue is full, false otherwise
     */
    public boolean isFull() {
        return rear == capacity;
    }
 
    /**
     * Adds an element to the rear of the queue if it is not full.
     * @param element the element to add
     */
    public void enqueue(int element) {
        if (!isFull()) {
            queue[rear] = element;
            rear++;
        } else {
            System.out.println("Queue is full!");
        }
    }
 
    /**
     * Removes the front element of the queue if it is not empty.
     */
    public void dequeue() {
        if (!isEmpty()) {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            queue[rear - 1] = 0;  
            rear--;
        } else {
            System.out.println("Queue is empty!");
        }
    }
 
    /**
     * Returns the front element of the queue without removing it.
     * @return the front element of the queue, or -1 if the queue is empty
     */
    public int front() {
        if (!isEmpty()){
            return queue[front];
        }
        return -1;
    }
 
    /**
     * Displays all elements in the queue from front to rear.
     */
    public void display() {
        if (!isEmpty()) {
            for (int i = front; i < rear; i++) {
                System.out.println(queue[i]);
            }
        } else {
            System.out.println("Queue is empty!");
        }
    }
}