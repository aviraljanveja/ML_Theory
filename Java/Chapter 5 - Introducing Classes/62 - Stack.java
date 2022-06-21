/**
 * @author AviralJanveja
 * The Stack stores data using LIFO - 'last in first out' ordering.
 * Stacks are traditionally controlled through two operations called push and pop. 
 */

// This class defines an integer stack that can hold 10 values.
class stackdemo {
	int stck[] = new int[10]; // The stack of integers is held by the array stack.
	int tos; // tos stands for 'top of stack'. Array index variable,
	
	// Initialize top-of-stack
	stackdemo() {
		tos = -1; // The stack constructor initialized tos to -1 to indicate an empty stack array.
		// as we know, array index starts from 0.
	}
	
	// Push an item onto the stack
	void push(int item) {
		if(tos == 9)
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	// Pop an item from the stack
	int pop() {
		if(tos < 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
}

public class Stack {

	public static void main(String[] args) {
		
		stackdemo mystack1 = new stackdemo();
		stackdemo mystack2 = new stackdemo();
		
		// Push some numbers onto the stack
		for (int i = 0; i<10; i++) mystack1.push(i);
		for (int i = 10; i<20; i++) mystack2.push(i);
		
		// Pop those numbers off the stack
		System.out.println("Stack in mystack1: ");
		for(int i=0; i<10; i++) 
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2: ");
		for(int i=0; i<10; i++) 
			System.out.println(mystack2.pop());
		
	}

}
