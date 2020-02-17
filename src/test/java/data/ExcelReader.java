package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	static FileInputStream FIS = null;
	public FileInputStream geFileInputStream()
	{
		String path = System.getProperty("user.dir")+"/src/test/java/data/userData.xlsx";
		File scrFile = new  File(path);
		try {
			FIS = new FileInputStream(scrFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data File Not Found"+ e.getMessage());
		}
		return FIS;
	}

	public Object [][] getExcelData() throws IOException
	{
		FIS = geFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sheet = wb.getSheetAt(0);

		int totalNumberOfRows = sheet.getLastRowNum()+1;
		int totalNumberOfColomns = 4;
		String [][] arrayExcelData = new String [totalNumberOfRows][totalNumberOfColomns];

		for (int i = 0; i < totalNumberOfRows; i++) 
		    {

			for (int j = 0; j < totalNumberOfColomns; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString(); 	
			}

		}
		wb.close();
		return arrayExcelData;
	}
}
