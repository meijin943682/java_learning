public class Heap 
{
	Node[] array;
	int count;

	public Heap()
	{
		array = new Node[100];
		count = 0;
	}

	public void push(Comparable item)
	{
		array[count] = new Node(item);
		updateUp(count);
		count++;	
	}

	private void updateUp(int now)
	{
		if (now == 0)
			return;
		
		int father = (now - 1) / 2;
		if (array[father].item.compareTo(array[now].item) < 0)
		{
			swap(father, now);
			updateUp(father);
		}
	}

	public Object pop()
	{
		if (count == 0)
			return null;
		Object item = array[0].item;
		array[0] = array[count - 1];
		array[count - 1] = null;
		count--;
		updateDown(0);
		return item;	
	}

	private void updateDown(int now)
	{
		int left = now * 2 + 1;
		int right = now * 2 + 2;
		if (left >= count)
			return;
		if (right >= count)
		{
			if (array[now].item.compareTo(array[left].item) < 0)
			{
				swap(now, left);
				updateDown(left);
			}
			return;
		}

		int next = (array[left].item.compareTo(array[right].item) >= 0) ? left : right;
		if (array[now].item.compareTo(array[next].item) < 0)
		{
			swap(now, next);
			updateDown(next);
			return;
		}
	}

	public void swap(int a, int b)
	{
		Node temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
