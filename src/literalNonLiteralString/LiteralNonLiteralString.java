package literalNonLiteralString;

public class LiteralNonLiteralString {

	public static void main(String[] args) {
		String s = "Anand";
		String s1 = "Anand";
	System.out.println("Literal String");
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	
		String s2 = new String("Anand");
		String s3 = new String("Anand");
	System.out.println("Non-Literal String");
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	}

}
