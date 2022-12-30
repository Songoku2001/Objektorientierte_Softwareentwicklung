public class Paar<A, B> extends Box<A> {
	B e2;

	public Paar(A e1, B e2) {
		super(e1);
		this.e2 = e2;
	}
	public static void main(String[] args) {
		Box<String> bs = new Paar<>("Hallo", "Welt");
	}
	
}
