public class Test
{
	public static void main (String[] arg)
	{
		Queue queue = new Queue();
		queue.push(8);
		queue.push(9);
		System.out.println(queue.pop());
		queue.push(7);
		System.out.println(queue.pop());
		queue.push(10);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());

	
	}
}
