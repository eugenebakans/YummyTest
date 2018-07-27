package com.bakans.yummytest.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@Name("Content Block")
@FindBy(className = "content-page")
public class ContentBlock extends HtmlElement {

    @FindBy(xpath = "./div[@class = 'anime-column']")
    private List<WebElement> animeItems;

    @FindBy(xpath = "./ul[@class = 'pagination']")
    private WebElement pagination;

}
