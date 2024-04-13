package org.flipkart.pages;
import org.junit.Assert;
import org.mar.pro.Base_Class_Pract;
import org.mar.pro.PLPage_Locators_Pract;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
public class PLPage_Pract extends Base_Class_Pract
{

	
	
	public static void verifyUserRedirectsToPLPage()
	{
		try
		{
			WebElement sortby = new PLPage_Locators_Pract().getSortBy();
			if(sortby.isDisplayed())
			{
				System.out.println("User redirects to PLP Page");
			}}
		catch(NoSuchElementException e)
		{
			Assert.fail("User doesn't redirects to PLPPage");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void clickOnFirstProduct() {
		try {
			WebElement ele = new PLPage_Locators_Pract().getRedmieMob();
			click(ele);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	}



