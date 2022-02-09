import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenExcel {
    @Test
    public void login() throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\mohds\\Desktop\\AutomationFramework\\DataDriven\\src\\main\\resources\\web-data.xlsx"));
        XSSFSheet sh = wb.getSheet("login");
        //reading data
        //  String pwd=sh.getRow(1).getCell(1).toString();
        // System.out.println(pwd);
        //printing how many rows are there
        int rownum = sh.getLastRowNum();
        System.out.println("Index of last row is " + rownum);
        // to get last cell number
        int colnum = sh.getRow(0).getLastCellNum();
        System.out.println(colnum);
        //reading all the values from the excel sheet
        for (int i = 0; i <= rownum; i++) {
            String un = sh.getRow(i).getCell(0).toString();
            String pwd = sh.getRow(i).getCell(1).toString();
            System.out.println(un);
            System.out.println(pwd);
        }
    }
    public static void main(String[] args) throws IOException {
       DataDrivenExcel de=new DataDrivenExcel();
       de.login();
    }
}
