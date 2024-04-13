package org.mar.pro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Locators_Pract extends Base_Class_Pract
{
	public Home_Page_Locators_Pract()
	 {
		PageFactory.initElements(driver, this);
	 }
	@FindBy(xpath="//*[text()='✕']")
	private WebElement closebutton;
	@FindBy(name="q")
	private WebElement searchInputField;
	public WebElement getCloseButton()
	{
		return closebutton;
	}
	public WebElement getSearchInputField()
	{
		return searchInputField;
	}
}
