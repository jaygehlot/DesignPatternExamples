package com.jgehlot.dp.factory.exampleTwo;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    private List<String> pages = new ArrayList<>();

    Website() {
        this.createWebsite();
    }

    abstract void createWebsite();

    List<String> getPages() {
        return pages;
    }

    void setPages(List<String> pages) {
        this.pages = pages;
    }
}
