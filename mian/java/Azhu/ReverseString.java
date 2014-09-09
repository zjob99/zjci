
public class ReverseString {
	
	public static String reverse1(String x){
		char[] tmp = x.toCharArray();
		
		for (int i = 0; i < x.length()/2; i++) {
			char temp=tmp[i];
			tmp[i]=tmp[x.length()-1-i];
			tmp[x.length()-1-i]=temp;
        }
		return new String(tmp);
	}
	public static String reverseRecursive(String x){
		if (x.length()==1) {
			return x;
		}

		String rev = x.charAt(x.length()-1)+reverseRecursive(x.substring(0, x.length()-1));
		//System.out.println(rev);
		return rev;
	}
	public static void main(String[] args){
		System.out.println(ReverseString.reverse1("12345"));
		System.out.println(ReverseString.reverseRecursive("abcde"));
	}
}