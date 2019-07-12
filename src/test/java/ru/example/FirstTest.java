package ru.example;

import org.junit.Test;
import ru.example.data.TestDataForFirstTest;
import ru.example.pages.MainYandexPage;


public class FirstTest extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        //Класс с тестовыми данными
        TestDataForFirstTest testDataForFirstTest = new TestDataForFirstTest();

        MainYandexPage mainYandexPage = new MainYandexPage(driver);
        //MarketChoicePage marketChoicePage = mainYandexPage.submitMarketLink();
        //ElektronikaPage elektronikaPage = marketChoicePage.submitElektronikaLink();
        //MobilePage mobilePage = elektronikaPage.submitMobileLink();
        //MobileChoicePage mobileChoicePage = mobilePage.submitAllFiltersButton();
        //mobileChoicePage.selectSearchOptions(
        //        testDataForFirstTest.getPriceFrom()
        //);
        //ResultChoiceMobilePage resultChoiceMobilePage = mobileChoicePage.submitShowSuitableButton();
        //resultChoiceMobilePage.checkCountShowElement();
        //SearchResultFirstFoundElementPage searchResultFirstFoundElementPage = resultChoiceMobilePage.titleFirstElement();
    }
}