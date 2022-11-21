package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
//import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void fillTextBox(WebElement u, String t) {
		u.sendKeys(t);
	}

	public static void btnClick(WebElement b) {
		b.click();
	}

	public static void toRightClick(WebElement ele) {
		ac = new Actions(driver);
		ac.contextClick(ele).perform();
	}

	public static void toDoubleClick(WebElement ele) {
		ac = new Actions(driver);
		ac.doubleClick(ele).perform();
	}

	public static void mouseHover(WebElement ele) {
		ac = new Actions(driver);
		ac.moveToElement(ele).perform();
	}

	public static void toApplyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void toCopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toCut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);

		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toSave() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);

		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void toTakeSnap(String fName, String picName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"D:\\Software Testing Tutorial\\eclipse-workspace\\MavenProjects\\" + fName + "\\" + picName + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void jsSendKeys(String val, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value',' " + val + " ')", ele);
	}

	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

//	public static String readFromExcel(String fName, String shName, int rowNo, int cellNo) throws IOException {
//		// 1.File Location
//		File f = new File(
//				"D:\\Software Testing Tutorial\\eclipse-workspace\\MavenProjects\\ExternalFiles\\" + fName + ".xlsx");
//		// 2.To read from excel
//		FileInputStream fin = new FileInputStream(f);
//		// 3.Workbook Interface instantiation
//		Workbook book = new XSSFWorkbook(fin);
//		// 4.To fetch a sheet
//		Sheet sh = book.getSheet(shName);
//		// 5.To fetch a row
//		Row r = sh.getRow(rowNo);
//		// 6.To fetch a cell
//		Cell c = r.getCell(cellNo);
//		int type = c.getCellType();
//		String name = " ";
//		if (type == 1) {
//			name = c.getStringCellValue();
//		} else if (DateUtil.isCellDateFormatted(c)) {
//			Date d = c.getDateCellValue();
//			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
//			name = sim.format(d);
//		} else {
//			double dt = c.getNumericCellValue();
//			long o = (long) dt;
//			name = String.valueOf(o);
//		}
//		return name;
//
//	}

	public static void getDateAndTime() {
		Date d = new Date();
		System.out.println(d);

	}

}
