package helper;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static Object[][] readExcel(String filePath) throws Exception {
        FileInputStream file = new FileInputStream(new File(filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount - 1][2]; // Assuming 2 columns (username & password)

        for (int i = 1; i < rowCount; i++) {
            data[i - 1][0] = sheet.getRow(i).getCell(0).getStringCellValue(); // Username
            data[i - 1][1] = sheet.getRow(i).getCell(1).getStringCellValue(); // Password
        }

        workbook.close();
        file.close();
        return data;
    }
}
