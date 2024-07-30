package com.upgrade.dataprovider;

import org.testng.annotations.DataProvider;

public class GenericDataProvider {

    @DataProvider(name = "skipSideEffectsBooleanDataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {false},
                {null},

        };
    }
}
