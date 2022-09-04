package com.selenium_2022.com.selenium_2022.testCases;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import 	 com.selenium_2022.com.selenium_2022.pageObjects.HomePage;


public class TC_HomePageTest_001 extends BaseClass {
	
	
	@Test
	public void homePageTest() {
	HomePage hp= new HomePage();
		 hp.getTitle();
	        hp.selectRadioButton();
	        hp.selectDropDown();
	        hp.selectCheckbox();
	        hp.openNewWindow();
	        hp.alertExample();
	        hp.switchTab();
	        hp.alertExample();
	        hp.table();
	        hp.tableFixedHeader();
		
	}
	

}
