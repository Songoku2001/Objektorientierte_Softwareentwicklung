import java.util.ArrayList;

public class Main2 {
	public static void main(String... args) {
		java.util.List<String> xs = new ArrayList<>();
		xs.add("Freunde");
		xs.add("Römer");
		xs.add("Landsleute");
		System.out.println(xs.size());
		System.out.println(xs.get(1));
		System.out.println(xs.contains("Römer"));
		System.out.println(xs.contains("Gallier"));
		xs.add("leiht");
		xs.add("mir");
		xs.add("euer");
		xs.add("Ohr");
		System.out.println(xs.size());
		System.out.println(xs.get(6));
		System.out.println(xs.get(0));
		System.out.println(xs.get(3));
		xs.remove(3);
		System.out.println(xs.size());
		System.out.println(xs.get(3));
		System.out.println(xs);
		xs.forEach(x -> System.out.println(x) );
		
	}
		
}
