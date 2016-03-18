public class Queue
{
	 Object item;
	 Node head;
	 Node now;
	
	public Queue()
	{
		head = null;
		now = null;
	}
	public void push(Object item)	
	{
		if(head == null)
		{	
			Node next = new Node(item,null);
			head = next;
			now = next;
		}
		else
		{	
			Node next = new Node(item,null);
			now.next = next;
			now = next;
		}
	}
	public Object pop()
	{
		Object item = null;
		if(head == null)
		{
			System.out.println("Error");
		}
		else
		{
			item = head.item;
			head = head.next;
		}
		return item;
	}
}
