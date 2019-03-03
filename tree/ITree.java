package tree;

public interface ITree<T> {
	public INode<T> root();
	public INode<T> parent(INode<T> n);
	public IIterator<INode<T>> children(INode<T> n);	//返回一个INode<T> 类型的的迭代器
	public boolean isExternal(INode<T> n);
	public boolean isInternal(INode<T> n);
	public boolean isRoot(INode<T> n);
	public int size();
	public boolean isEmpty();
	public IIterator<T> iterator();			//T类型的迭代器
	public IIterator<INode<T>> nodes();		
	public T replace(INode<T> n, T e);
 }
