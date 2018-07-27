package com.bakans.yummytest.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.element.CheckBox;
import java.util.List;

@Name("Anime Filter")
@FindBy(id="filter-block")
public class AnimeFilterBlock extends HtmlElement {

    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[1]/div/ul/li[@class = 'search-field']")
    private WebElement genreSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[2]/div/ul/li[@class = 'search-field']")
    private WebElement animeTypeSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[3]/select")
    private WebElement animeStatusSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[4]/select")
    private WebElement numberOfSeriesSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[5]/input[@name = 'from-year']")
    private TextInput fromYearSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[5]/input[@name = 'to-year']")
    private TextInput toYearSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[6]/div/ul/li[@class = 'search-field']")
    private WebElement translationTypeSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[7]/select")
    private WebElement ageSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[8]/select")
    private WebElement sortSelector;
    @FindBy(xpath=".//form[@class='filter-block']/div[@class='filter-body']/div[9]//input")
    private CheckBox onlyWithVideoSelector;
    @FindBy(xpath="//*[@id='filter-block']/form/div[3]/button")
    private Button applyFilterButton;

    public AnimeFilterBlock selectGenre(int position) {
        genreSelector.click();
        this.findElements(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li")).get(position).click();
        return this;
    }
    public AnimeFilterBlock deselectGenre(int position) {
        genreSelector.findElement(By.xpath("../li[@class = 'search-choice']/a[@data-option-array-index = '" + position + "']")).click();
        return this;
    }
    public AnimeFilterBlock selectAnimeType(int position) {
        animeTypeSelector.click();
        this.findElements(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li")).get(position).click();
        return this;
    }
    public AnimeFilterBlock deelectAnimeType(int position) {
        animeTypeSelector.findElement(By.xpath("../li[@class = 'search-choice']/a[@data-option-array-index = '" + position + "']")).click();
        return this;
    }
    public AnimeFilterBlock selectAnimeStatus(int position) {
        animeStatusSelector.click();
        animeStatusSelector.findElements(By.xpath("./option")).get(position).click();
        return this;
    }
    public AnimeFilterBlock selectTranslationType(int position) {
        translationTypeSelector.click();
        this.findElements(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li")).get(position).click();
        return this;
    }
    public AnimeFilterBlock deselectTranslationType(int position) {
        translationTypeSelector.findElement(By.xpath("../li[@class = 'search-choice']/a[@data-option-array-index = '" + position + "']")).click();
        return this;
    }
    public AnimeFilterBlock addFromYearFilter(String fromYear) {
        fromYearSelector.sendKeys(fromYear);
        return this;
    }
    public AnimeFilterBlock addToYearFilter(String toYear) {
        toYearSelector.sendKeys(toYear);
        return this;
    }
    public AnimeFilterBlock onlyWithVideoSelect() {
        onlyWithVideoSelector.select();
        return this;
    }
    public AnimeFilterBlock onlyWithVideoDeselect() {
        onlyWithVideoSelector.deselect();
        return this;
    }
    public void applyFilter(WebDriver driver) {
        applyFilterButton.submit();
    }
}
