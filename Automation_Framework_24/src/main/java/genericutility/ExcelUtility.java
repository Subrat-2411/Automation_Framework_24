package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Subrat
 */
public class ExcelUtility {
	/**
	 * This method is used to read data from excel file in String format
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return String value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/viratdemowebshoptestscript.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
	}
	/**
	 *  This method is used to read number data from excel file in double format.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return double value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumberDataFromExcel(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/viratdemowebshoptestscript.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		
	}
	/**
	 * 	 This method is used to read boolean data from excel file in boolean format.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return boolean value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/viratdemowebshoptestscript.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
		
	}
	
	/**
	 * 	 This method is used to read time data from excel file in LocalDateTime format.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return LocalDateTime value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getDateandTimeDataFromExcel(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/viratdemowebshoptestscript.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getLocalDateTimeCellValue();
		
	}
}
