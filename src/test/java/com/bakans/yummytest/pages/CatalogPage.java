package com.bakans.yummytest.pages;

import com.bakans.yummytest.elements.AnimeFilterBlock;
import com.bakans.yummytest.elements.HeaderMenu;
import com.bakans.yummytest.elements.SearchPanel;
import org.openqa.selenium.WebDriver;

public class CatalogPage extends AbstractPage{

    private HeaderMenu headerMenu;
    private SearchPanel searchPanel;
    private AnimeFilterBlock filterblock;

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void filterByGenre(int position) {
        filterblock.selectGenre(position).applyFilter(this.driver);
    }
    public void removeGenre(int position) {
        filterblock.deselectGenre(position).applyFilter(this.driver);
    }
    public void filterByAnimeStatus(int position) {
        filterblock.selectAnimeStatus(position).applyFilter(this.driver);
    }

    public void searchByTitle(String title) {
        searchPanel.search(title);
        searchPanel.openSearchResult(driver);
    }


}
