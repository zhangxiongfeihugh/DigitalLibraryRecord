package SPL_DIGITAL_LIB;

public class SplayTreeUtils<T> {
	
	public void zig(SplayTreeNode<T> node) {
		if(node == null || node.parent == null || node.parent.left != node) {
			System.out.println("Unable to rotate!");
			return;
		}
		SplayTreeNode<T> beforeParent = node.parent;
		SplayTreeNode<T> subParent = beforeParent.parent;
		beforeParent.left = node.right;
		if(node.right != null) {
			node.right.parent = beforeParent;
		}
		node.right = beforeParent;
		beforeParent.parent = node;
		node.parent = subParent;
		if(subParent == null) {
			node.root = node;
		} else if(subParent.right == beforeParent) {
			subParent.right = node;
		} else {
			subParent.left = node;
		}
	}
	
	public void zag(SplayTreeNode<T> node) {
		
	}
	
	public void insert(SplayTreeNode<T> root, SplayTreeNode<T> node) {
		
	}
	
	public SplayTreeNode<T> delete(SplayTreeNode<T> root, SplayTreeNode<T> node) {
		
	}
	
	public SplayTreeNode<T> search(SplayTreeNode<T> root, T searchitem){
		
	}
	
	
}