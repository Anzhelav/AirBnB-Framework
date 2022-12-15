package com.automation.stepdef;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    @Before
    public void setUp(){
        ConfigReader.initProperties();
        DriverUtils.createDriver();
    }
    @After
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        DriverUtils.getDriver().quit();
    }


}
