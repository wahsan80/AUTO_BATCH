package Oct30_Session;

public class Two_Dimentional_Array {

	public static void main(String[] args) {
		
		int[][] a15 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		for (int row=0; row<a15.length; row++) {
			for (int col=0; col<a15[row].length; col++){
				System.out.print(a15[row][col] + " ");
			}	
		}
	}

}
