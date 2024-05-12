


public class Queue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value) {
		arr[rear] = value;
		rear++;
	}
	
	public void pop() {
		front++;
	}
	
	public int peek() {
		
		return arr[front];
	}
	
	public boolean isFull() {
		return rear == SIZE;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	

}















