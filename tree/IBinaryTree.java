package tree;

public interface IBinaryTree<T> extends ITree<T> {
	public IBNode<T> left(IBNode<T> n);
	public IBNode<T> right(IBNode<T> n);
	public boolean hasLeft(IBNode<T> n);
	public boolean hasRight(IBNode<T> n);
	public IBNode<T> addRoot(T e) throws Exception;
	public IBNode<T> insertLeft(IBNode<T> n, T e) throws Exception;
	public IBNode<T> insertRight(IBNode<T> n, T e) throws Exception;
	public IBNode<T> remove(IBNode<T> n) throws Exception;
	public void attach(IBNode<T> n, IBinaryTree<T> t1, IBinaryTree<T> t2) throws Exception;
	
}
