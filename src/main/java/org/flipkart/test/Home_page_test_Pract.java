package org.flipkart.test;

import org.flipkart.pages.Home_page;
import org.flipkart.pages.PLPage_Pract;
import org.mar.pro.Base_Class_Pract;

public class Home_page_test_Pract extends Base_Class_Pract
{
	@Test
	public void addToCart() throws Exception
	{
		String data =getTestData("SearchData");
		Home_page.clickclosebutton();
		Home_page.testSetup();
		Home_page.searchData(data);
		PLPage_Pract.verifyUserRedirectsToPLPage();
		//PLPage_Pract.Cl
	}

}
