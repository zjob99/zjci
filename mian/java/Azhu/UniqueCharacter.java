
public class UniqueCharacter {
	
	public static boolean isUnique(String x){
		if (x.length() > 256) {
			return false;
		}
		boolean[] chs=new boolean[256];
		//chs[0]='p';
		System.out.println("--"+chs[0]);
		for (int i=0; i<x.length(); i++) {
			int current = (int)x.charAt(i);
			System.out.println((int)current);
			if (chs[current]) return false;
			chs[current]=true;
		}
		return true;
	}
	public static void main(String[] args){
		System.out.println(UniqueCharacter.isUnique("desic j"));
	}
}
