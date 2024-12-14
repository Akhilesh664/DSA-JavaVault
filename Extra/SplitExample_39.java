package Extra;

public class SplitExample_39 {
	
	public static void main(String[] args) {
	
		String str = "hello my name is abrar";
		String[] words = str.split("\\s");
		
		for(String s : words) {
			System.out.println(s+" ");
		}
	}
}
