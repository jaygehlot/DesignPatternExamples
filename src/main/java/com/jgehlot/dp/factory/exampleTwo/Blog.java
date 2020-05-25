package com.jgehlot.dp.factory.exampleTwo;

import java.util.List;

public class Blog extends Website {

    @Override
    void createWebsite() {

        setPages(List.of(new PostPage().webPageType(), new ContactPage().webPageType(), new AboutPage().webPageType() ));

//        pages.add(new PostPage().webPageType());
//        pages.add(new ContactPage().webPageType());
//        pages.add(new AboutPage().webPageType());
    }
}
