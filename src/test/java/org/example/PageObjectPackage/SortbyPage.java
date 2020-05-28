package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SortbyPage extends DriverFactory {

        @FindBy(id = "ProductLandingSortOptionsDropdown")
        WebElement relevance;

        public void relevancePrice() throws InterruptedException {
            relevance.click();
            Thread.sleep(3000);
            Select sel = new Select(relevance);
            sel.selectByVisibleText("Price (high to low)");
        }
    }

