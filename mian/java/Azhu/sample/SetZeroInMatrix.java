package sample;

public class SetZeroInMatrix {
	public static int[][] cvt(int[][] v){
		int rowN=v.length;
		int colN=v[0].length;
		System.out.println("rowN:"+rowN+"colN"+colN);
		int[][] k = new int [rowN][colN];
		for (int i=0; i<rowN; i++){
			for (int j=0 ; j<colN; j++) {
				k[i][j]=v[i][j];

			}
		}		
		
		for (int i=0; i<rowN; i++){
			for (int j=0 ; j<colN; j++) {
				System.out.println(v[i][j]);
				if (v[i][j]==0) setZero(i,j, k);
			}
		}		
		return k;
	}	
	public static int[][] setZero(int row, int col, int[][] v){
		System.out.println("row:"+row+"  Col"+col);
		int rowN=v.length;
		int colN=v[0].length;

		for (int i=0; i<colN; i++){
			v[row][i]=0;
		}
		for (int j=0; j<rowN; j++){
			v[j][col]=0;
		}
		return v;
	}
	public static void printMatrix(int[][] v){
		for (int k[] : v){
			System.out.println();
			for (int m : k) {
				System.out.print(String.valueOf(m)+ " ");
			}
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] v={{6, 2,3,6}, {7,0,1,3},{7,8,8,9}};
		int[][] target = SetZeroInMatrix.cvt(v);
		SetZeroInMatrix.printMatrix(target);
		
	}

}
