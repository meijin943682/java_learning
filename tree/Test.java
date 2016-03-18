import java.util.Random;

public class Test
{
	public static void main(String[] args)
	{
	/*	BST bst = new BST();
		bst.insert(5, "aaa");
		bst.insert(7, 5);
		bst.insert(9, '@');

		find(bst, 7);
		find(bst, 10);
*/
		Heap heap = new Heap();
		Random random = new Random();

		for (int i = 0; i < 16; i++)
		{
			int number = random.nextInt(100);
			heap.push(number, number);
			System.out.print(number + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 16; i++)
		{
			System.out.print(heap.pop() + " ");
		}
		System.out.println();

	}

/*	public static void find(BST bst, int id) 
	{
		Object item = bst.find(id);
		if (item == null)
			System.out.println("No item.");
		else
			System.out.println(item);
	}
*/	
}
