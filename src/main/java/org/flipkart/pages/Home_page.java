package org.flipkart.pages;

import org.mar.pro.Base_Class_Pract;
import org.mar.pro.Home_Page_Locators_Pract;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;


public class Home_page extends Base_Class_Pract
{
public static void testSetup()
{
	try
	{
		browserOpen("chrome");
		loadUrl("https://www.flipkart.com/");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
    }
    public static void clickclosebutton()
    {
    	try
    	{
    		Home_Page_Locators_Pract hp = new Home_Page_Locators_Pract();
    		click(hp.getCloseButton());
    	}
    	catch(NoSuchElementException e)
    	{
    		System.out.println(e.getMessage());
    	}
        }
    public static void searchData(String data)
    {
    	try
    	{
    		new Home_Page_Locators_Pract().getSearchInputField().sendKeys(data, Keys.ENTER);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    }
}
