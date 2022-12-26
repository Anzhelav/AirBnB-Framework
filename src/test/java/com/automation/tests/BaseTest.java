package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    HomePage homePage;
    LoginPage loginPage;
     @BeforeMethod
    public void setUp(){
        ConfigReader.initProperties();
        DriverUtils.createDriver();
        homePage = new HomePage();
        loginPage= new LoginPage();

    }

     @AfterMethod
    public void quit(){
        DriverUtils.getDriver().quit();
    }
}
