package com.propellerads;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import com.propellerads.page.SearchResultPage;
import com.propellerads.page.YandexMainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class FirstTest {
    @Test
    void firstTest() {
        Selenide.open("http://ya.ru");
        $("#text").setValue("PropellerAds");
        $("div.search2__button button").click();

        Selenide.$$("li.serp-item").shouldHave(CollectionCondition.sizeGreaterThan(10));
    }

    @Test
    void checkAdDisplaying() {
        Selenide.open("http://ya.ru", YandexMainPage.class)
                .setSearchQuery("PropellerAds")
                .search()
                .checkResultCount(10);

    }
}
