package bst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

	private BinarySearchTree<Integer> tree;
	
	@Before
	public void setUp() throws Exception {
		tree = new BinarySearchTree<Integer>();
	}

	@Test
	public void insert() {
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(10);
		tree.insert(35);
		tree.insert(60);
		tree.insert(80);
		tree.insert(15);
		tree.insert(78);
		tree.traverse();
	}

	@Test
	public void height() {
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(10);
		tree.insert(35);
		tree.insert(60);
		tree.insert(80);
		tree.insert(15);
		tree.insert(78);
				
		assertEquals(3, tree.height());
	}
	
}
