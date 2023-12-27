package com.org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;

	public static void Browserlauch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@SuppressWarnings("deprecation")
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@SuppressWarnings("deprecation")
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static WebElement senddata(WebElement element, String s) {
		element.sendKeys(s);
		return element;
	}
	public static WebElement click(WebElement element) {
		
		element.click();
		return element;
		
	}
	public static WebElement findElementById(String id) 
	{
		return driver.findElement(By.id(id));
	}
	public static WebElement findElementBy_xpath(String id) 
	{
		return driver.findElement(By.xpath(id));
	}
	public static void clear(WebElement element) {
		element.clear();
	}

	public static void dropdown(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	
	public static WebElement movetoelement(WebElement val)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(val).build().perform();
		return val;	
	}
	public static WebElement explicitlyWait(long sec, By x) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait.until(ExpectedConditions.presenceOfElementLocated(x));
	}
	public static WebElement get_the_detaisl(WebElement element) {
		element.getAttribute("value");
		return element;		
	}
	public static void takescreenshot() {
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Oct_cucumber_cheapair\\src\\test\\resources\\Testdata\\Purchasepage.jpeg");
		
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void window() {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(!string.equals(windowHandle)) {
				driver.switchTo().window(string);
			}
		}
	}
	public static String excelread(int row, int cell) {
		String value= null;
			try {
				File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\AdactinProjectOCT\\src\\test\\resources\\Testdata.xlsx");
				FileInputStream f1 =new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(f1);
				Sheet sheet = wb.getSheet("Sheet1");
				Row row2 = sheet.getRow(row);
				Cell cell2 = row2.getCell(cell);
				int cellType = cell2.getCellType();
				if(cellType==1) {
					value = cell2.getStringCellValue();
					System.out.println(value);	
				} else if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell2)) {
						Date dateCellValue = cell2.getDateCellValue();
						SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yy");
						value = sd.format(dateCellValue);
						System.out.println(value);	
					}
					else {
						double numericCellValue = cell2.getNumericCellValue();
						long l=(long)numericCellValue;
						value = String.valueOf(l);
						System.out.println(value);
					}
				}	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return value;
	}
	public static String excelwrite(int i, int j, String data) {
		String value=null;
		try {
			File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\AdactinProjectOCT\\src\\test\\resources\\Testdata.xlsx");
			FileInputStream fis =new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet createSheet = wb.createSheet("Sheet6");
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(j);
			createCell.setCellValue(data);
			FileOutputStream fo=new FileOutputStream(f);
			wb.write(fo);
			wb.close();		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	public static String propertyread(String data) {
		String value=null;
		try {
			File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\AdactinProjectOCT\\src\\test\\resources\\Creadential.properties");
			FileReader fr= new FileReader(f);
			Properties p=new Properties();
			p.load(fr);
			value=p.getProperty(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public static WebElement windowhandle(WebElement element) {
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(string.equals(windowHandle)) {
				driver.switchTo().window(string);
				element.click();
			}
		}
		return element;
	}

}
