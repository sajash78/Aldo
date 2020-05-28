package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class Homepage extends DriverFactory {
    @FindBy(xpath ="//body/div/div/div/div/header/div/div/nav/ul/li[3]/button[1]/span[1]/span[1]")
WebElement men;
@FindBy(xpath = "//li[3]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[2]//ul[1]//li[3]//a[1]")
WebElement loafers;
public void loaferMethod() throws InterruptedException {
    Thread.sleep(3000);
    Actions action = new Actions(driver);
    action.moveToElement(men).perform();
    Thread.sleep(3000);
    action.moveToElement(loafers).click().perform();
}
    public void homePageUrl(){
        String shoes= driver.getCurrentUrl();
        Assert.assertThat(shoes, Matchers.containsString("aldo"));
        if (shoes.contains("aldo")){
            System.out.println("Assertion is passed"); // if else concept
        } else {
            System.out.println("Assertion is failed");
        }
    }

//saj

// dev






}
