package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Productpage extends DriverFactory {
    @FindBy(xpath = "//li[3]//div[1]//a[1]//span[1]//picture[1]//img[1]")
    WebElement drorelian;
    @FindBy(xpath = "//main//div//div//div//div//div//div//div//div[4]//button[1]")
    WebElement addtobasket;
    public void shoe() throws InterruptedException {
        drorelian.click();
        Thread.sleep(4000);

        List<WebElement> sizes= driver.findElements(By.cssSelector(".c-product-option-list__list-item.o-option-rectangle.o-option-rectangle--size"));
        for (WebElement size:sizes){
            System.out.println(size.getText());

            if (size.getText().contains("11")){
                size.click();
                Thread.sleep(2000);
                addtobasket.click();
    }

    }}}
//}
