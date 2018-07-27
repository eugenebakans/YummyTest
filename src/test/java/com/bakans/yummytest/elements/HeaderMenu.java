package com.bakans.yummytest.elements;


import com.bakans.yummytest.pages.CatalogPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Button;

@Name("Header Menu")
@FindBy(css = "ul.menu.clearfix")
public class HeaderMenu extends HtmlElement {

    @FindBy(xpath = "./li[1]")
    private Button mainPageButton;
    @FindBy(xpath = "./li[2]")
    private Button newsButton;
    @FindBy(xpath = "./li[3]/ul/li[1]")
    private Button catalogButton;
    @FindBy(xpath = "./li[3]/ul/li[2]")
    private Button ongoingButton;
    @FindBy(xpath = "./li[3]/ul/li[3]")
    private Button noticeButton;
    @FindBy(xpath = "./li[4]")
    private Button topHundredButton;
    @FindBy(xpath = "./li[5]")
    private Button RandomButton;
    @FindBy(xpath = "./li[6]/ul/li[1]")
    private Button reviewsButton;
    @FindBy(xpath = "./li[6]/ul/li[2]")
    private Button usersButton;
    @FindBy(xpath = "./li[6]/ul/li[3]")
    private Button chatButton;
    @FindBy(xpath = "./li[7]")
    private Button bloggersVideoButton;
    @FindBy(xpath = "./li[8]/ul/li[1]")
    private Button FAQButton;
    @FindBy(xpath = "./li[8]/ul/li[2]")
    private Button rulesButton;
    @FindBy(xpath = "./li[8]/ul/li[3]")
    private Button ruleHoldersButton;
    @FindBy(xpath = "./li[8]/ul/li[4]")
    private Button aboutButton;
    @FindBy(xpath = "./li[8]/ul/li[5]")
    private Button privacyButton;


    public CatalogPage openCatalogPage(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(HeaderMenu.this.findElement(By.xpath("li[3]"))).build().perform();
        catalogButton.click();
        return new CatalogPage(driver);
    }
}
