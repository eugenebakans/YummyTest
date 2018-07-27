package com.bakans.yummytest.testng;

import com.bakans.yummytest.steps.Steps;

public class Runner {
    public static void main(String[] args) {
        Steps steps = new Steps();
        System.out.println("LLLLLLLLLLLLLLLLLLLL");
       // steps.initMozillaBrowser();
        steps.initChromeBrowser();
        steps.openYummy();
        steps.loginYummy("BladeRunnr", "Indigo8195");
        steps.openCatalog();
        steps.filterByGenre();
        steps.removeFilterByGenre();
        steps.filterByStatus();
        System.out.println("LLLLLLLLLLLLLLLLLLLL");
        steps.closeDriver();
    }
}
