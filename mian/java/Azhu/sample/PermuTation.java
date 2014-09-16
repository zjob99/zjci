package sample;

public class PermuTation {

	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean isPermutation(String s, String t) {
		return sort(s).equals(sort(t));
	}
	public static void main(String[] args){
		System.out.println(PermuTation.isPermutation("12345", "34521"));
		
	}
}
