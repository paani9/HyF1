package POM_scripts;

public class Example1 {
	package org.sms.admin.testng;

	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;
	import org.tyss.SMS_Sandford_Park_School.BaseClass;
	import org.tyss.objectRepository.Allexampage;
	import org.tyss.objectRepository.Tabnamesforhomepage;

	public class CreateExamTest extends BaseClass {
		@Test
		public void createExamTest() {
			//comment

			String examname = "exam" + jb.getRandomNumber(10000);
			Allexampage ad = new Allexampage(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			commonpage.clickRequiredTab(Tabnamesforhomepage.EXAMTAB, wb);
			commonpage.clickRequiredTab(Tabnamesforhomepage.CREATEEXAMTAB, wb);
			ad.addButtonClick();
			ad.addExam(examname);
			List<WebElement> headerlist = ad.getHeaderList();
			List<WebElement> namelist = new ArrayList<WebElement>();
			WebElement dd = driver.findElement(By.xpath("//select[@name='example1_length']"));
			Select s=new Select(dd);
			s.selectByVisibleText("100");
			//for (WebElement hl : headerlist) {
				//String headername = hl.getText();
				//if (headername.equals("Name"))
			
			
					WebElement text = driver.findElement(By.xpath("//table[@id='example1']//thead//following-sibling::tbody//tr//td[.='"+examname+"']"));
			String exam = text.getText();
			System.out.println(exam);
			System.out.println(examname);
			wb.jsIntialization(driver);
			wb.scrollTillElementViewUsingJS(text);
			if(exam.equals(examname))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
			
			
			
			/*for (WebElement hl : headerlist) {
				String headername = hl.getText();
				if (headername.equals("Name")) {

					namelist = ad.getNameList();

					int count = 0;

					for (WebElement n : namelist) {
						String nd = n.getText();

						if (nd.equals(examname)) {
							System.out.println("TC Pass");
							count++;
							break;

						}

					}
	            WebElement id = driver.findElement(By.xpath("//div[@id=\"example1_paginate\"]//ul//li[last()-1]//a"));
	            System.out.println(id.getText());
	             int idb = Integer.parseInt(id.getText());
				String nm = id.getAttribute("data-dt-idx");
				System.out.println(nm);
	             for(int i=2;i<=idb;i++)
	             {
	            	 ad.nextbuttonClick();
					namelist = ad.getNameList();
					for (WebElement n : namelist) {
						String nd = n.getText();

						if (nd.equals(examname)) {
							System.out.println("TC Pass");
							count++;
							break;

						}
					}
					}
					if (count == 0) {
						System.out.println("Tc fail");
					}
				}
				
	*/
			
		}



}
