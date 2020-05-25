package com.jgehlot.dp.factory.exampleTwo;

public class WebsiteFactory {

    public static Website getWebsite(SiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case WEBSHOP:
                return new Webshop();
            default : {
                return null;
            }
        }
    }
}
