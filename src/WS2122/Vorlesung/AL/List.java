public interface List<E> {
	void add(E e);
	void remove(int i);
	int length();
	boolean contains(E e);
	E elementAt(int i);
	
	default void printAll() {
		for (int i = 0; i < length(); i++) {
			System.out.print(elementAt(i)+" ");
		}
		System.out.println();
	}
}
