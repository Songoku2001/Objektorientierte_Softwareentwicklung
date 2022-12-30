public class AL<E> implements List<E> {
	@SuppressWarnings("unchecked")
	private E[]	store = (E[])new Object[5];	
	private int size=0;
	
	@Override
	public void add(E e) {
		if (size>=store.length) {
			enlargeStore();
		}
		store[size++] = e;
	}

	private void enlargeStore() {
		@SuppressWarnings("unchecked")
		var newStore = (E[])new Object[store.length+5];
		for (int i = 0; i < store.length; i++) {
			newStore[i]=store[i];
		}
		store=newStore;		
	}

	@Override
	public void remove(int i) {
		for (int j = i+1; j < size; j++) {
			store[j-1]=store[j];
		}
		size--;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public boolean contains(E e) {
		for (int i = 0; i < size; i++) {
			if(store[i].equals(e)) return true;
		}		
		return false;
	}

	@Override
	public E elementAt(int i) {
		return store[i];
	}

}
