package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class DataDriven2  {

	@Test
	public void method1() {
		System.out.println("Method1");

	}

	@Test
	public void method4() {
		System.out.println("Method4");
		Assert.assertTrue(false);
	}

	@Ignore
	@Test
	public void method2() {
		System.out.println("Method2");

	}

	@Test
	public void method5() {
		System.out.println("Method5");

	}

	@Test
	public void method3() {
		System.out.println("Method3");

	}
}
