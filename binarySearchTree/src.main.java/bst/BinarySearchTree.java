package bst;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node<T> root;
	
	public void insert(T ele) {
		if( root == null)
			root = new Node<T>(ele);
		else
			root = insert(root, ele);
	}

	private Node<T> insert(Node<T> root, T ele) {
		if(root == null)
			return new Node<T>(ele);
		
		if(root.ele.compareTo(ele) > 0)
			root.left = insert(root.left, ele);
		
		if(root.ele.compareTo(ele) < 0)
			root.right = insert(root.right, ele);
		return root;
	}

	public void traverse()
	{
		traverse(root);
	}
	
	private void traverse(Node<T> root)
	{
		if(root != null)
		{
			traverse(root.left);
			System.out.println(root.ele);
			traverse(root.right);
		}
	}

	private class Node<T extends Comparable<T>>{
		
		private Node<T> left;
		private Node<T> right;
		private T ele;
		

		public Node(T ele) {
			this.ele = ele;
		}
				
	}

	public int height() {
		return height(root);
	}

	private int height(Node<T> root)
	{
		if(root == null)
			return -1;
		
		int left = height(root.left);
		int right = height(root.right);
		
		return Math.max(left, right) + 1;
	}
	
}
