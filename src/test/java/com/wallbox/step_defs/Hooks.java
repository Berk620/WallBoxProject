package com.wallbox.step_defs;

import com.wallbox.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

        @Before("@ui")
        public void setUp(){
            Driver.get().manage().window().maximize();
            Driver.get().manage().deleteAllCookies();
            Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @After("@ui")
        public void tearDown(Scenario scenario){
            //if the scenario fails take the screenshot
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot,"image/png");
            }

            Driver.closeDriver();
        }




    }


