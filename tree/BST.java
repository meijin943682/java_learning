public class BST
{
	Node root;

	public BST()
	{
		root = null;
	}	

	public void insert(int id, Object item)
	{
		root = insert(root, new Node(id, item));	
	}

	private Node insert(Node now, Node newNode)
	{
		if (now == null)
		{	
			return newNode;
		}

		if (now.id > newNode.id)
		{
			now.left = insert(now.left, newNode);
		}	
		else
		{
			now.right = insert(now.right, newNode);
		}

		return now;
	}

	public Object find(int id)
	{
		Node ans = find(root, id);
		if (ans == null)
			return null;
		
		return ans.item;
	}

	private Node find(Node now, int id)
	{
		if (now == null)
			return null;

		if (now.id == id)
			return now;
		
		if (now.id > id)
			return find(now.left, id);
		else
			return find(now.right, id);
	}
}

