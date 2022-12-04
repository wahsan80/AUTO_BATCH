package nov13_Session;

public class Excel_Operatiuons {
	
	//Step 1. Create the excel sheet. 
	//Step 2. Add maven dependencies for excel file
	//Step 3. use a utility file
	//Operations that are required. Doing below

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\nov13_Session\\SampleData.xlsx";
		
		Xls_Reader xls = new Xls_Reader(path);

		//1. to get the row count
		
		int row = xls.getRowCount("ShoppingTest");
		System.out.println(row);
		
		//2. to get the col count
		
		int col = xls.getColumnCount("ShoppingTest");
		System.out.println(col);
		
		//3. Read data from excel file
		
		String data = xls.getCellData("ShoppingTest", 2, 3);
		System.out.println(data);
		
		String data1 = xls.getCellData("ShoppingTest", "ProductName", 4);
		System.out.println(data1);
		
		//4. Write into excel sheet
		
		xls.setCellData("ShoppingTest", "ProductName", 11, "SonyTV");
		
	}

}
