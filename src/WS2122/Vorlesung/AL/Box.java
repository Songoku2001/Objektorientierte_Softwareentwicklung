public class Box<E> {
	E e1;

	public Box(E e1) {
		super();
		this.e1 = e1;
	}
	public static void main(String[] args) {
		Box<String> sb = new Box<>("hallo");
		String s = sb.e1;
		//sb.e1=42;
		
		Box<Integer> ib = new Box<Integer>(42);
		int i = ib.e1;
	}
}
