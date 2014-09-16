package sample;
//convert aabbbc to a2b3c1, if the converted string is longer, return itself
public class CountContinuousDup {
	public static String cvtString(String s) {
		StringBuilder sb=new StringBuilder();
		char[] tmp = s.toCharArray();
		char pre = s.charAt(0);int ct=0;char cur=pre;
		for (int i=0; i<s.length(); i++){
			char cc=s.charAt(i);
			if (cc==pre){
				ct++;
				System.out.println(cc+":"+ct);
			}
			else {

				sb.append(String.valueOf(pre)+":" + String.valueOf(ct)+", ");
				pre=cc;
				ct=1;
			}
			if (i==s.length()-1){
				sb.append(String.valueOf(cc)+":"+String.valueOf(ct));
			}
				
		}
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(CountContinuousDup.cvtString("abbbccde"));
		
	}
}
