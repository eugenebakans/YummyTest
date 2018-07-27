package com.bakans.yummytest.pages;

import com.bakans.yummytest.elements.*;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage {

    private AuthenticationBlock authBlock;
    private HeaderMenu headerMenu;
    private SearchPanel searchPanel;
    private AnimeFilterBlock filterblock;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage loginYummmy(String email,String pass){
        authBlock.signIn(email,pass);
        return new MainPage(this.driver);
    }



    public void goToCatalogPage(WebDriver driver){headerMenu.openCatalogPage(driver);}



}
