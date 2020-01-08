package TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends HomePage{

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=0)
	public void MenuClickTEst() throws InterruptedException, IOException {

	
	Thread.sleep(4000);
		AdminClick();
	}
	
	@Test(priority=1)
	public void PIMClickTEst() throws InterruptedException {
		
		PIMClick();
	}
	
	@Test(priority=2)
	public void LeaveClickTEst() throws InterruptedException {
		
		LeaveClick();
	}
	@Test(priority=3)
	public void TimeClickTEst() throws InterruptedException {
		
		TimeClick();
	}
	@Test(priority=4)
	public void RecruitementClickTEst() throws InterruptedException {
		
		RecruitementClick();
	}
	
	@Test(priority=5)
	public void PerformanceClickTEst() throws InterruptedException {
		
		PerformanceClick();
	}
	
	
}
