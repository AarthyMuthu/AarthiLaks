package org.mar.pro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PLPage_Locators_Pract extends Base_Class_Pract
{
	public PLPage_Locators_Pract()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Sort By']")
	private WebElement sortBy;
	@FindAll({
		@FindBy(xpath="//*[@loading='eager']"),
		@FindBy(xpath="//*[contains(@alt, 'REDMI')]")
	})
	private WebElement RedmieMob;
	public WebElement getRedmieMob()
	{
		return RedmieMob;
	}
	public WebElement getSortBy()
	{
		return sortBy;
	}

}
