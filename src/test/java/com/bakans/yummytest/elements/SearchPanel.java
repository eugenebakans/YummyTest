package com.bakans.yummytest.elements;

import com.bakans.yummytest.pages.CatalogPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Search panel")
@FindBy(xpath = "//div[@class = 'search-block-wrapper main-search clearfix']")
public class SearchPanel extends HtmlElement {

    @FindBy(xpath = ".//input[@class = 'search']")
    private TextInput searchField;

    public void search(String animeTitle) {
        searchField.sendKeys(animeTitle);
    }
    public CatalogPage openSearchResult(WebDriver driver) {
        return new CatalogPage(driver);
    }

}
