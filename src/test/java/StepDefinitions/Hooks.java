package StepDefinitions;

import Utilities.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenario(){
        System.out.println("Scenario has started");
    }

    @After
    public void afterScenario(){
        BasicDriver.quitDriver();
        System.out.println("Scenario has ended");
    }

//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("step has started");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("step has ended");
//    }
}
