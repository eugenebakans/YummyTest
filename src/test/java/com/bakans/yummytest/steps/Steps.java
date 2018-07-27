package com.bakans.yummytest.steps;

import com.bakans.yummytest.pages.CatalogPage;
import com.bakans.yummytest.pages.ProfileSettingsPage;
import com.bakans.yummytest.pages.ProfilePage;
import com.bakans.yummytest.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;

public class Steps {

    private WebDriver driver;
    //private final Logger logger = Logger.getLogger(Steps.class);

    public void initChromeBrowser() {
        System.setProperty("webdriver.chrome.driver","D:\\private\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        setTimeouts();
    }

    public void initMozillaBrowser() {
        System.setProperty("webdriver.gecko.driver", "D:\\private\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        setTimeouts();
    }

    public void setTimeouts() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
    }


    public void openYummy() {
        driver.get("https://yummyanime.com");
    }

    public void loginYummy(String login, String pass) {
        MainPage mainPage = new MainPage(driver);
        mainPage.loginYummmy(login, pass);
    }
    public void openCatalog() {
        MainPage mainPage = new MainPage(driver);
        mainPage.goToCatalogPage(driver);
    }
    public void filterByGenre() {
        CatalogPage mainPage = new CatalogPage(driver);
        mainPage.filterByGenre(3);
    }
    public void removeFilterByGenre() {
        CatalogPage mainPage = new CatalogPage(driver);
        mainPage.removeGenre(3);
    }

    public void filterByStatus() {
        CatalogPage mainPage = new CatalogPage(driver);
        mainPage.filterByAnimeStatus(1);
    }
    public void closeDriver() {
        driver.quit();
    }
}
