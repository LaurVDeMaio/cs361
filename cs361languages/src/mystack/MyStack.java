/**
 * 
 */
package mystack;

/**
 * @author Lauren DeMaio
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;
	private MyNode<T> head;

	/**
	 * 
	 */
	public MyStack() {
		head = null;
	}

	public T pop() {
		// TODO To complete
		MyNode<T> n = head;
		head = head.next;
		return n.val;
	}

	public void push(T v) {
		// TODO To complete
		MyNode<T> n = new MyNode<T>(v, theStack);
		n.next = head;
		head = n;
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> nums = new MyStack<Integer>();
		// Push 1 and 2
		nums.push(1);
		nums.push(2);
		// Pop
		nums.pop();
		//System.out.println(nums.pop()); check
		// Push 5
		nums.push(5);
		//System.out.println(nums.pop()); check
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> people = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1 = new Person("Lauren", "DeMaio");
		people.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
		people.push(p2);
		
		//System.out.println(people.pop().getFname()); check
		//System.out.println(people.pop().getFname()); check
	}

}
