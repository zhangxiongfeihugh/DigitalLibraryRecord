package SPL_DIGITAL_LIB;

public class SplayTreeNode<T>{
	public T data;
	public SplayTreeNode<T> left;
	public SplayTreeNode<T> right;
	public SplayTreeNode<T> parent;
	
	public SplayTreeNode(){
	}
	
	public SplayTreeNode(T data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data+"\nLEFT    |    "+this.left+"\nRIGHT   |    "+this.right;
	}
}