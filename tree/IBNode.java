package tree;

public class IBNode<T> implements INode<T> {

	private T element;
	private IBNode<T> parent;
	private IBNode<T> rightChild;
	private IBNode<T> leftChild;
	
	public IBNode(T e){
		element = e;
	}
	
	public T element() {
		return null;
	}

	public IBNode<T> getParent() {
		return parent;
	}

	public IBNode<T> getRightChild() {
		return rightChild;
	}

	public IBNode<T> getLeftChild() {
		return leftChild;
	}

	public void setParent(IBNode<T> parent) {
		this.parent = parent;
	}

	public void setRightChild(IBNode<T> rigthChild) {
		this.rightChild = rigthChild;
	}

	public void setLeftChild(IBNode<T> leftChild) {
		this.leftChild = leftChild;
	}
	
}
