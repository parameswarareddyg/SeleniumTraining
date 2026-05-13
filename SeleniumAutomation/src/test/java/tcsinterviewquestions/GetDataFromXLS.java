package tcsinterviewquestions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GetDataFromXLS {

	public static void main(String[] args) throws Exception {
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File("./src/test/resources/data2.xls")));
		HSSFSheet sheet = workbook.getSheet("credentials");
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
