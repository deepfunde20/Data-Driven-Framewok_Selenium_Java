package pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import basePackage.baseclass;

public class HomePage extends baseclass{

	static List <WebElement> list;
	public HomePage() throws IOException {
		super();

	}

	
	public static  void TakeMenuList() {
		
 list=		driver.findElements(By.xpath("//div[@class='menu']//ul//li"));

	}
	
	public void AdminClick() throws InterruptedException {
		TakeMenuList();
	
		for(int i=0; i<list.size();i++) {
			
		if	(list.get(i).getText().equals("Admin")) {
		
			list.get(i).click();
		
		Thread.sleep(3000);
		break;
		}	
		}
		TakeMenuList(); // To elemenate StaleElement Exception
		boolean value = driver.findElement(By.id("btnDelete")).isDisplayed();
		Assert.assertEquals(value, true);
	}
	
	public void PIMClick() throws InterruptedException {
		for(int i=0; i<list.size();i++) {
			
		if	(list.get(i).getText().equals("PIM")) {
			list.get(i).click();
		Thread.sleep(3000);
		break;
		
		}
		}
		TakeMenuList();
		boolean value = driver.findElement(By.id("empsearch_supervisor_name")).isDisplayed();
		Assert.assertEquals(value, true);
	}
	
	public void LeaveClick() throws InterruptedException {
		for(int i=0; i<list.size();i++) {
			
		if	(list.get(i).getText().equals("Leave")) {
			list.get(i).click();
		Thread.sleep(3000);
		break;
		
		}
		}
		TakeMenuList();
		boolean value = driver.findElement(By.id("menu_leave_viewLeaveList")).isDisplayed();
		Assert.assertEquals(value, true);
	}
	
	public void TimeClick() throws InterruptedException {
		for(int i=0; i<list.size();i++) {
			
		if	(list.get(i).getText().equals("Time")) {
			list.get(i).click();
		Thread.sleep(3000);
		break;
		
		}
		}
		TakeMenuList();
		boolean value = driver.findElement(By.id("time_startingDays")).isDisplayed();
		Assert.assertEquals(value, true);
	}
	
	public void RecruitementClick() throws InterruptedException {
		for(int i=0; i<list.size();i++) {
			
		if	(list.get(i).getText().equals("Recruitment")) {
			list.get(i).click();
		Thread.sleep(3000);
		break;
		
		}
		}
		TakeMenuList();
		boolean value = driver.findElement(By.id("menu_recruitment_viewJobVacancy")).isDisplayed();
		Assert.assertEquals(value, true);
	}
	public void PerformanceClick() throws InterruptedException {
		for(int i=0; i<list.size();i++) {
			
			Actions ac = new Actions(driver);
			
			
		if	(list.get(i).getText().equals("Performance")) {
			
			ac.moveToElement(list.get(i)).build().perform();
			driver.findElement(By.id("menu_performance_viewEmployeePerformanceTrackerList")).click();;
			
		
			
		Thread.sleep(3000);
		break;
		
		}
		}
		TakeMenuList();
		String value	=driver.findElement(By.xpath("//div[@class='head']")).getText();
		Assert.assertEquals(value, "Performance Trackers");
	}
			
			
	
}
