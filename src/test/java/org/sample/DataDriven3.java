package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven3 {
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		int count=0;
		
		for (int i = 0; i < links.size(); i++) {
			
			String link_Name = links.get(i).getAttribute("href");
			
			if (!(link_Name==null)) {
				
				URL url = new URL(link_Name);
				URLConnection openConnection = url.openConnection();
				
				HttpsURLConnection connection = (HttpsURLConnection) openConnection;
				
				int responseCode = connection.getResponseCode();
				
				if (!(responseCode==200)) {
					
					count++;
					System.out.println(link_Name);
					
				}
				
				
			}
		}
		
		System.out.println("Broken Link count:"+count);
	}
}
