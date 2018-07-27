package com.bakans.yummytest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends  AbstractPage{



    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

}
