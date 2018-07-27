package com.bakans.yummytest.pages;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public abstract class AbstractPage
{
    protected WebDriver driver;

    //public abstract void openPage();

    public AbstractPage(WebDriver driver)
    {
        this.driver = driver;
        HtmlElementLoader.populatePageObject(this, driver);
    }
}

