import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.lowagie.text.pdf.hyphenation.TernaryTree.Iterator;

public class readdataexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1 create object of workbook
		FileInputStream fis = new  FileInputStream("C:\\Users\\chava\\Downloads\\Excel sheet.xlsx");
		XSSFWorkbook  workbook = new XSSFWorkbook(fis);
		
		
		//2 Create object of sheet allocate to respect sheet
		int numSheet = workbook.getNumberOfSheets();
		XSSFSheet sheet = null;
		for(int i=0;i<numSheet;i++) {
			if(workbook.getSheetName(i).equals("LoginData"))
		 sheet= workbook.getSheetAt(i);
		}  
		//Fetch data form file in iterator
		Iterator<Row> itrow = sheet.iterator();
		while(itrow.hasNext()) {
		Row row =itrow.next();
		Iterator<Cell> itcell = row.cellIterator();	
		while(itcell.hasNext()) {
			Cell c =(Cell)itcell.next();
			System.out.println(c.getStringCellValue());
		}
		}
		}
		

	}


