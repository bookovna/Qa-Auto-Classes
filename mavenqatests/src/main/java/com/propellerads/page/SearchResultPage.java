package com.propellerads.page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SearchResultPage extends YandexMainPage {

    private ElementsCollection searchResults = Selenide.$$("li.serp-item");

    public void checkResultCount(int expectedCount) {
        searchResults.shouldHave(CollectionCondition.sizeGreaterThan(expectedCount));
    }

}
