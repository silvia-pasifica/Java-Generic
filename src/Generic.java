
public class Generic <T>{
	
	private T[] items = (T[]) new Object[10];
	private int count;
	
	public void add(T item) {
		items[count++] = item;
	}
	
	public T get(int idx) {
		return items[idx];
	}
	
}


