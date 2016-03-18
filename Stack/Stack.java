public class Stack
{
	Object item;
	Node head;
	
	public Stack ()
	{
		head = null;
	}

	public void push(Object item)
	{
		head = new Node(item, head);
	}

	public Object pop()
	{
	 	Object item = null;
		if(head == null)
			System.out.println("Error");
		else
		{
			item = head.item;
			head = head.next;
		}
		return item;
	}

	private class Node
	{
		public Object item;
		public Node next;

		public Node (Object item, Node next)
		{
			this.item = item;
			this.next = next;
		}	
	}
}
