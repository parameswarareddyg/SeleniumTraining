package tcsinterviewquestions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromXLSX {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File("./src/test/resources/data1.xlsx")));
		XSSFSheet sheet = workbook.getSheet("credentials");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i =1;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
		workbook.close();
	}
}
