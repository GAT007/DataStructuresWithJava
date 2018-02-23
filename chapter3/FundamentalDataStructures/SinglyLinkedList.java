package chapter3.FundamentalDataStructures;

public class SinglyLinkedList<E> {
	
	private static class Node<E>
	{
		private E element; // reference to the element stored in this node
		private Node<E> next; // reference to the subsequent node in this list
		public Node(E e, Node<E> n) 
		{
			element = e;
			next = n;
		}
		public E getElement() {return element;}
		public Node<E> getNext() { return next; }
		public void setNext(Node <E> n) { next = n;}
	}
	// end of the nested node class
	
	private Node<E> head = null; //head node of the list
	private Node<E> tail = null; //last node of the list goes here
	private int size = 0;
	public SinglyLinkedList() {}	
	
	//accessor methods
	public int size() { return size; } 
	public boolean isEmpty() { return size == 0; }
	public E first()
	{
		if(isEmpty()) return null;
		return head.getElement();
	}
	
	public E last()
	{
		if(isEmpty()) return null;
		return tail.getElement();
	}
		
	

}
