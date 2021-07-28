package Step_Definition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Reusable_Functions.Generic_functions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Refer_a_friend_positive_scenario extends Generic_functions {
	
	public static boolean value;
	public static String str;
	public static WebElement from,to;
	public static int elementX,elementY;
	public static String exacttext;
	public static MobileElement e;
	/*Browser launch*/
	@Given("launch the URL")	
	public  void app_launching() throws Exception  {
		try {
			app_launch();
			page_wait(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@When("Login with valid data")
	public void loginWithValidData() throws IOException {
		click("welcome_login");
		page_wait(60);
		value = driver.findElement(By.xpath(OR_reader("login_page_title"))).isDisplayed();
		Assert.assertEquals(true,value);
		driver.findElement(By.xpath(OR_reader("login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
		driver.findElement(By.xpath(OR_reader("login_password"))).sendKeys(td_reader("login_password",0));
		click("login");
	}

	/*TC 001 - Validate that user must be able to view Refer a Friend under Home page*/
	@Then("verify Tell your friends about Mpowered Health text and logo is displayed")
	public static void login_positive_tc_001() throws Exception   {
		try {

			page_wait(50);
			str= driver.findElement(By.xpath(OR_reader("refer_frnd_home_text"))).getText();
			Assert.assertEquals(str,td_reader("refer_frnd_home_text"));
			value = driver.findElement(By.xpath(OR_reader("refer_frnd_icon"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_001");
		}
	}

	/*TC 002 - Validate that user must be able to click on Refer a Friend button displayed in the home page*/
	@When("clicks on Refer a Friend")
	public static void login_positive_tc_002() throws Exception   {
		try {
			click("home_refer_button");

		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_002");
		}
	}
	@Then("navigated to Refer a Friend landing page")
	public void navigated_to_refer_a_friend_landing_page() throws Exception {
		try {
			value = driver.findElement(By.xpath(OR_reader("refer_frnd_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (IOException e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_002");
		}

	}
	/*TC 003 - Validate that user must be able to view the referral code text*/
	@Then("verify referral code text is displayed")
	public static void login_positive_tc_003() throws Exception   {
		try {
			page_wait(40);
			str = driver.findElement(By.xpath(OR_reader("refer_frnd_referral_code"))).getText();
			Assert.assertEquals(str,td_reader("refer_frnd_referral_code"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_003");
		}
	}
	/*TC 004 - Validate that the user should able to see a Pop Up box when clicking on Share a link */
	@ When("clicks on 'Share Link' button")
	public static void login_positive_tc_004() throws Exception{
		try {
			click("refer_frnd_share_link_button");	
			} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_004");
		}
	}

	
	/*TC 005 -Validate that the user should able to  send link via Facebook or Mail */
	@Then("clicks on 'Facebook'")
	public void clicks_on() throws Exception {
		try {
			page_wait(60);
			exacttext = td_reader("refer_frnd_referral_facebook");
			horizontalscroll(exacttext);
			
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_005");
		}	
		
	}
	@And("clicks on 'Post'")
	public static void error_message() throws Exception   {
		try {
			
			click("refer_frnd_referral_post");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_005");
		}
	}


	
	@Then("clicks on 'Mail'")
	public static void refer_a_friend_positive_tc_005() throws Exception   {
		try {
			page_wait(60);
			exacttext = td_reader("refer_frnd_referral_gmail");
			horizontalscroll(exacttext);
			
				
			 
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_005");
		}
	}
	
	@And("verify mail is open")
	public static void copied_text() throws Exception   {
		try {
			page_wait(60);
			value = driver.findElement(By.xpath(OR_reader("refer_frnd_referral_sender"))).isDisplayed();
			Assert.assertEquals(true,value);
			
				
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_005");
		}
	}
	/*TC 006 - Validate that the user should able to send refer a friend link via Mail  */
	@When("Login with valid mail and password")
	public void refer_a_frnd_positive_tc_006() throws Exception {
		try {
			driver.findElement(By.xpath(OR_reader("refer_frnd_referral_sender"))).sendKeys(td_reader("refer_frnd_referral_sender"));
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_006");
		}
        }
	@Then("clicks on 'send'")
	public void clickssend() throws Exception {
     try {
    	 click("refer_frnd_referral_send");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_006");
		}
		
	}
	/*TC 007 - Validate that user can able to slide the two grids visible under How its works*/
	@Given("verify Invite your friends to Mpowered Health is displayed")
	public static void login_positive_tc_007() throws Exception   {
		try {
			value = driver.findElement(By.xpath(OR_reader("refer_frnd_how_it_works"))).isDisplayed();
			Assert.assertEquals(true,value);
			value = driver.findElement(By.xpath(OR_reader( "refer_frnd_first_slider"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_007");
		}
	}

	

	
	@When("clicks to slide the gird")
	public static void grid_slideer() throws Exception   {
		try {
			elementX= driver.findElement(By.xpath(OR_reader("refer_frnd_first_slider"))).getLocation().getX();
			elementY= driver.findElement(By.xpath(OR_reader("refer_frnd_first_slider"))).getLocation().getY();
			swipe_right_to_left(elementX, elementY,2);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_007");
		}
	}
	@Then("navigated to next slide")
	public static void nextslide() throws Exception   {
		try {
			value = driver.findElement(By.xpath(OR_reader("refer_frnd_last_slider_text"))).isDisplayed();
			Assert.assertEquals(true,value);
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("navigated to next slide");
		}
	}

	/*TC 008 -  Validate that user can able to click on the link More information & FAQ and it will navigated to Frequently asked questions page*/
	@When("clicks on the link More information & FAQ")
	public static void login_positive_tc_008() throws Exception   {
		try {
			click("refer_frnd_more_info_link");
		} catch (Exception e) {
			e.printStackTrace();
			takeScreenShot("refer_a_frnd_positive_tc_008");
		}
	}

		/*TC 009 - Validate that the user should able to view list of frequently asked questions inside Frequently asked questions page*/
		@Then("verify list of Frequently asked questions")
		public static void login_positive_tc_009() throws Exception   {
			try {
				value = driver.findElement(By.xpath(OR_reader("refer_frnd_FAQ_title"))).isDisplayed();
				Assert.assertEquals(true,value);
				System.out.println("Refer a friend positive");
				close();
			} catch (Exception e) {
				e.printStackTrace();
				takeScreenShot("refer_a_frnd_positive_tc_009");
			}
		}
}

