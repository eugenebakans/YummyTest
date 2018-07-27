package com.bakans.yummytest.elements;

import com.bakans.yummytest.pages.ProfileSettingsPage;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

import java.util.List;

@Name("Profile Menu")
@FindBy(xpath = ".//div[@class = 'content full-width']/div[@class = 'clearfix row']/div[2]")
public class ProfileMenuBlock extends HtmlElement {

    @FindBy(xpath = "./div[@class = 'inner-block']/ul/li")
    private List<Link> menuLinks;

    public void openSettingsPage() {
        menuLinks.get(4).click();
    }
}
