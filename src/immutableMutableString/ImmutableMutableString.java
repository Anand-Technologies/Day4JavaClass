package immutableMutableString;

public class ImmutableMutableString {
	public static void main(String[] args) {
		
			String s = "Anand";
			String s1 = "Yuvan";
		System.out.println("Immutable String");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
			String co = s.concat(s1);
		System.out.println(System.identityHashCode(co));

			StringBuffer s2 = new StringBuffer("Anand");
			StringBuffer s3 = new StringBuffer("Yuvan");
		System.out.println("Mutable String");
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
			StringBuffer co1 = s2.append(s3);
		System.out.println(System.identityHashCode(co1));
	}
}
