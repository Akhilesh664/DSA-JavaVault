package Extra;

public class IndexOfExample_37 {
	
	public static void main(String[] args) 
	{
		String str = "java developer at regex";

		System.out.println(str.indexOf('r'));
		System.out.println(str.indexOf("regex"));
		System.out.println(str.indexOf("at"));
		System.out.println(str.indexOf("e",7));
	}
}
