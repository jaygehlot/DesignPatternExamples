package com.jgehlot.dp.factory.exampleTwo;

public class Example {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(SiteType.BLOG);
        System.out.println(website.getPages());

        website = WebsiteFactory.getWebsite(SiteType.WEBSHOP);
        System.out.println(website.getPages());
    }
}
