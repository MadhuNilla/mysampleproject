package pages;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class LoginPage extends BasePage{

    @Test
    public void login() {
        try {
            File src = new File("//Users//user//Desktop//testdata1.xls");
            FileInputStream file = new FileInputStream(src);
            // XSSFWorkbook xs=new XSSFWorkbook(file);
            HSSFWorkbook wb = new HSSFWorkbook(file);
            HSSFSheet sheet1 = wb.getSheetAt(0);
            int rowno = sheet1.getLastRowNum();
            System.out.println("number of rows: " + rowno);
            String data = sheet1.getRow(0).getCell(0).getStringCellValue();
            String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
            System.out.println("data from excel :" + data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void log()
    {

    }
}