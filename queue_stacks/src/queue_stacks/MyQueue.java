package queue_stacks;

public class MyQueue {

	int tail;
	int max;
	public int[] array;
	
	public MyQueue (int queueSize) {
		this.array = new int[queueSize];
		this.max = this.array.length;
		this.tail = 0;		
	}

	public void eliminar () {
		if(tail == 0) {
			System.out.println("#");
		}else {
			for(int i = 0; i < array.length-1; i++) {
				array[i] = array[(i+1)];
			}
		}
	}
	public void añadir (int dato) {
		if(tail == max) {
			System.out.println("Queue is full");
		} else {
			array[tail] = dato;
			tail++;
		}
	}
}
