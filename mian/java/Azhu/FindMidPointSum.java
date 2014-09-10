
public class FindMidPointSum {
	public static int getMidPoint(int[] input){
		int idxLeft = 0;
		int idxRight=input.length-1;
		int sumLeft=input[idxLeft]; int sumRight=input[idxRight];
		while (idxLeft<=idxRight){
			
			System.out.println(String.valueOf(idxLeft)+":"+String.valueOf(idxRight));
			
			if (sumLeft<sumRight) {
				idxLeft++;
				sumLeft+=input[idxLeft];
			}
			else if (sumLeft>sumRight){
				idxRight--;
				sumRight+=input[idxRight];
			}
			else {
				if (idxLeft+idxRight==input.length){
				
					System.out.println("Found it"+idxLeft);
					return idxLeft;
					
				}
				else {
					idxLeft++;
				}
			}
			
		}
		return -1;
	}
	   public static int findMiddleIndex(int[] numbers) throws Exception {
		   
	        int endIndex = numbers.length - 1;
	        int startIndex = 0;
	        int sumLeft = 0;
	        int sumRight = 0;
	        while (true) {
	            if (sumLeft > sumRight) {
	                sumRight += numbers[endIndex--];
	            } else {
	                sumLeft += numbers[startIndex++];
	            }
	            if (startIndex > endIndex) {
	                if (sumLeft == sumRight) {
	                    break;
	                } else {
	                    throw new Exception(
	                            "Please pass proper array to match the requirement");
	                }
	            }
	        }
	        return endIndex;
	    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = {1,2,3,4,1,1,1,5,2,8,0};
		//System.out.print(FindMidPointSum.getMidPoint(x));
		try {
			System.out.println(FindMidPointSum.findMiddleIndex(x));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
