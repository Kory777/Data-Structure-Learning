package tree;

import java.util.Iterator;

public interface IIterator<T> extends Iterable<T> {

	@Override
	public Iterator<T> iterator();
	public T next();
	public boolean hasNext();
	public void remove();
	
}
