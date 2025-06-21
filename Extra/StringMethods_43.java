package Extra;

public class StringMethods_43 {
	
	public static void main(String[] args) 
	{
		int n;
		String s = "Hello Java Developer!", t = "",u = "";
		n = s.length();
		System.out.println("length : "+n);
		
		t = s.concat("congratulations for this role.");
		System.out.println(t);
		
		u = s.replace("Java", "web");
		System.out.println(u);	
		
		String os = System.getenv("OS");
		System.out.println(os);
		
	}
}
