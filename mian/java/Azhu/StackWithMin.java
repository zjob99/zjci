import java.util.ArrayList;

//9:24
public class StackWithMin {
	public ArrayList<Integer> data = new ArrayList<Integer>();
	public ArrayList<Integer> min = new ArrayList<Integer>();
	public void push(int val){
		data.add(val);
		if (min.size()==0) min.add(val);
		else if (val<=data.get(min.size()-1)) min.add(val);
		
	}
	public int pop(){
		int dataToRemove= (int)data.remove(data.size()-1);
		if (dataToRemove==min.get(min.size()-1))
		
	}
	public int min(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
