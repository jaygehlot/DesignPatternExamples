package com.jgehlot.dp.factory.exampleTwo;

import java.util.List;

public class Webshop extends Website {

    @Override
    void createWebsite() {
        setPages(List.of(new CartPage().webPageType(), new ItemPage().webPageType(), new SearchPage().webPageType()));

//        pages.add(new CartPage().webPageType());
//        pages.add(new ItemPage().webPageType());
//        pages.add(new SearchPage().webPageType());
    }
}
