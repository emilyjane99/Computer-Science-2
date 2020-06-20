import java.util.Scanner;
import java.util.ArrayList;

class Main{ //Main Class
	pubic static void main(String[] args) { //Main Method
		//Create Queue class
		Queue3503 queue = new Queue3503(8);

		Scanner input = new Scanner (System.in);


		//Call Enqueue to insert 20 int from user into queue
		for(int i = 0;i < 20 ; i++ ) {
			//take user int
			v = input.nextInt();
			//pass user int to Enqueue
			queue.Enqueue(v);
		}
		//For Loop to print queue
		for(int i = 0; i < elements.size;i++){
			print(elements.get(i));
		}
		//Call Dequeue to remove beginning elements
		while (empty() = false){
			//Remove every 5th number
			for(int i = 0; i < 5; i++){
			queue.Dequeue();
			}
			//Print Queue after every 5th number is removed
			for(int i = 0; i < elements.size;i++){
			print(elements.get(i));
			}
		}
	}
}

class Queue3503{ //Queue Class
	int capacity = 0;
	int size = 0;
	int element = 0;
	boolean empty;

	public Queue3503(){ //no args constructor
		ArrayList<Integer> elements = new ArrayList<Integer>(0);	
	}

	public Queue3503(int capacity){ //args constructor
		this();
		elements.ensureCapacity(capacity);
	}
	public static void enqueue(int v){ //method
		//add int elements into queue
		elements.add(v);
		size++;
	}
	public static int dequeue(){ //method
		//remove and return first element of queue
		
		//check if size > 0
		if(empty() = false){
			element = elements.get(0);
			elements.remove(0);
			size--;
		}else{

			return -1;
		}

		return element;
	}
	public static boolean empty(){ //method
		//return true if queue is empty
		if (size = 0){
			empty = true;
		}else{
			empty = false;
		}

		return empty;
	}
	public static int getSize(){ //method
		//return size of queue (type int)
		size = elements.size();
	}

}