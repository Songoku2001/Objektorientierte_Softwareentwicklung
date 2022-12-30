public class Main {
	public static void main(String... args) {
		List<String> xs = new AL<>();
		xs.add("Freunde");
		xs.add("Römer");
		xs.add("Landsleute");
		System.out.println(xs.length());
		System.out.println(xs.elementAt(1));
		System.out.println(xs.contains("Römer"));
		System.out.println(xs.contains("Gallier"));
		xs.add("leiht");
		xs.add("mir");
		xs.add("euer");
		xs.add("Ohr");
		System.out.println(xs.length());
		System.out.println(xs.elementAt(6));
		System.out.println(xs.elementAt(0));
		System.out.println(xs.elementAt(3));
		xs.remove(3);
		System.out.println(xs.length());
		System.out.println(xs.elementAt(3));
		xs.printAll();
		
	}
}
