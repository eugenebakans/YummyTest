package com.bakans.yummytest.dataprovider;

import org.testng.annotations.DataProvider;

public class FilterDataProvider {

    @DataProvider(name = "filter")
    public Object[][] testData() {
        return new Object[][] {
                new Object[] {"160","45","17.6","Underweight"},
                new Object[] {"168","70","24.8","Normal"},
                new Object[] {"181","89","27.2","Overweight"},
                new Object[] {"178","100","31.6","Obesity"},
        };
    }
}
