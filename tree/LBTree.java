package tree;

public class LBTree<T> implements IBinaryTree<T>{
	private IBNode<T> root;
	
	public LBTree() {
		
	}
	
	@Override
	public INode<T> root() {
		return root;
	}

	@Override
	public INode<T> parent(INode<T> n) {
		IBNode<T> e = (IBNode<T>) n;
		if(isRoot(e)) {
			System.out.println("No parent!");
			return null;
		}
		return e.getParent();
	}

	@Override
	public IIterator<INode<T>> children(INode<T> n) {
		return null;
	}

	@Override
	public boolean isExternal(INode<T> n) {
		IBNode<T> e = (IBNode<T>) n;
		return (hasLeft(e)||hasRight(e));
	}

	@Override
	public boolean isInternal(INode<T> n) {
		
		return false;
	}

	@Override
	public boolean isRoot(INode<T> n) {
		IBNode<T> e = (IBNode<T>) n;
		return e.getParent() != null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public IIterator<T> iterator() {
		return null;
	}

	@Override
	public IIterator<INode<T>> nodes() {
		return null;
	}

	@Override
	public T replace(INode<T> n, T e) {
		return null;
	}

	@Override
	public IBNode<T> left(IBNode<T> n) {
		if(!hasLeft(n)) {
			System.out.println("No left!");
			return null;
		}
		return n.getLeftChild();
	}

	@Override
	public IBNode<T> right(IBNode<T> n) {
		if(!hasRight(n)) {
			System.out.println("No right!");
			return null;
		}
		return n.getRightChild();
	}

	@Override
	public boolean hasLeft(IBNode<T> n) {
		return n.getLeftChild() != null;
	}

	@Override
	public boolean hasRight(IBNode<T> n) {
		return n.getRightChild() != null;
	}

	@Override
	public IBNode<T> addRoot(T e) throws Exception {
		IBNode<T> n = new IBNode<T>(e);
		if(!isEmpty()) {
			root = n;
			return root;
		}
		else {
			throw new Exception("The tree is not empty!");
		}
			
			
	}

	@Override
	public IBNode<T> insertLeft(IBNode<T> n, T e) throws Exception {
		IBNode<T> newNode = new IBNode<T>(e);
		if(hasLeft(n)) {
			throw new Exception("It already has a left child");
		}
		n.setLeftChild(newNode);
		newNode.setParent(n);
		return newNode;
	}

	@Override
	public IBNode<T> insertRight(IBNode<T> n, T e) throws Exception {
		IBNode<T> newNode = new IBNode<T>(e);
		if(hasRight(n)) {
			throw new Exception("It already has a left child");
		}
		n.setRightChild(newNode);
		newNode.setParent(n);
		return newNode;
	}

	@Override
	public IBNode<T> remove(IBNode<T> n) throws Exception {	
		return null;
	}

	@Override
	public void attach(IBNode<T> n, IBinaryTree<T> t1, IBinaryTree<T> t2) throws Exception {
		
	}

}
