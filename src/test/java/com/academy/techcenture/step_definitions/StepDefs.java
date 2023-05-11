package com.academy.techcenture.step_definitions;

import com.academy.techcenture.driver.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepDefs {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = Driver.getDriver();
    }

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        // launch anguillaplus url
        driver.get("https://shop.anguillaplus.com/");
    }

    @When("the user clicks the lustre paper collection")
    public void the_user_clicks_the_lustre_paper_collection() {
        driver.findElement(By.className("dropdown")).click();
        Wait(2);
        driver.findElement(By.xpath("//ul[@class='dropdown']/li[3]")).click();
        Wait(3);
    }

    @When("the lustre paper collection is displayed")
    public void the_lustre_paper_collection_is_displayed() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("Page Title is not the same", "Lustre Paper– Anguilla Plus", actualTitle);
    }

    @Then("the user clicks the scilly peak print")
    public void the_user_clicks_the_silly_cay_print() {
        WebElement paperScillyPeakOption = driver.findElement(By.xpath("//*[@id=\"Collection\"]/div/div/div[3]/div[2]/div[11]/div/div[1]/a/img[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", paperScillyPeakOption);
        Wait(3);
        paperScillyPeakOption.click();
        Wait(3);
    }

    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    public static void Wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
