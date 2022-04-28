package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.commonmodule.Loader;

import java.util.*;

public class TestPageClientConfiguration extends TestBase {

    PageDashBoard pageDashBoard;
    PageClientConfiguration pageManageMyAccount;


    Loader loader;

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify valid user are allowed to access")


    @Test
    public void clickOnMMAAccordian() throws InterruptedException {
        Thread.sleep(30000);
//     loader.waitForLoaderToDispose();

        pageDashBoard = new PageDashBoard(eventFiringWebDriver);

//        Thread.sleep(5000);
        pageDashBoard.clickOnNavBar();

    }


    @Test
    public void clickOnAccordianAndSelectMMA() throws InterruptedException {
//        Thread.sleep(21000);
////     loader.waitForLoaderToDispose();
//        pageDashBoard = new PageDashBoard(eventFiringWebDriver);
//        pageDashBoard.clickOnNavBar();

        Thread.sleep(5000);
        pageDashBoard.clickOnManageMyAccountViaAccordion();
        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
        eventFiringWebDriver.switchTo().window(tabsCount.get(1));

    }


    @Test(dataProviderClass = DataProviderList.class, dataProvider = "Billedto")
//    @Test()
    public void doStarted(Map<String, String> testDataSet) throws InterruptedException {


//       testDataSet.entrySet().stream().forEach((k)-> System.out.println(k.getKey() + "" + k.getValue()));


        pageDashBoard.clickOnManageMyAccountViaAccordion();
        ArrayList<String> tabsCount = new ArrayList<>(eventFiringWebDriver.getWindowHandles());
        eventFiringWebDriver.switchTo().window(tabsCount.get(1));
        Thread.sleep(5000);
        pageManageMyAccount = new PageClientConfiguration(eventFiringWebDriver);

        Thread.sleep(15000);
        pageManageMyAccount.clickONSearchButton();
        Thread.sleep(2000);
        pageManageMyAccount.enterTxtSearchBilledto(testDataSet.get("Billedto"), Keys.ENTER);
        System.out.println("entered billedto and select");
        Thread.sleep(3000);
        pageManageMyAccount.selectBilledToFromList();
        Thread.sleep(5000);
        pageManageMyAccount.clickONSearchButton();
        Thread.sleep(5000);
        pageManageMyAccount.numberOfRowsDisplayed();
        Thread.sleep(5000);
        pageManageMyAccount.clickOnSenderComponentToggleBtn();
        Thread.sleep(5000);
        pageManageMyAccount.clickOnToggleButtonSenderStepper();
        pageManageMyAccount.clickOnSenderEditButton();
        Thread.sleep(5000);

        pageManageMyAccount.clickOnCancelIconOnSenderNameField();
        Thread.sleep(5000);
        pageManageMyAccount.clickOnSenderNameField(testDataSet.get("SenderName"));
        Thread.sleep(5000);

    }

    @Test(dataProviderClass = DataProviderList.class, dataProvider = "Billedto")

    public void verifyReceiverStepperIsDisabled(Map<String, String> testDataSet) throws InterruptedException {
        pageManageMyAccount.clickOnEditButtonOnReceiverComponent();
        Thread.sleep(5000);
        pageManageMyAccount.clickOnReceiverNameField();

    }


    @Test(dataProviderClass = DataProviderList.class, dataProvider = "Billedto")

    public void clickOnRequirementStepper(Map<String, String> testDataSet) throws InterruptedException {

//          pageManageMyAccount.clickOnToggleBtnOnRequirementStepper();
            if(!pageManageMyAccount.clickOnToggleBtnOnRequirementStepper()){

            pageManageMyAccount.clickOnToggleBtnOnRRequirementsComponentVisible();

            }

            pageManageMyAccount.clickOnEditBtnRequirementStepper();
            pageManageMyAccount.enterTxtOnShipperReferenceField(testDataSet.get("Invalid Shipper Reference"));
            pageManageMyAccount.enterTxtOnShipperReferenceField(testDataSet.get("Valid Shipper Reference"));
            pageManageMyAccount.clickOnEditBtnOnServiceStepper();
            pageManageMyAccount.clickOnServiceOnFieldRestrictionsOB();
            pageManageMyAccount.clickOnSurchargesFieldOB();

            pageManageMyAccount.clickOnEditBtnOnParcelStepperOB();

            pageManageMyAccount.clickOnRadioBtn3OnParcelStepperOB();

            pageManageMyAccount.clickOnNewEntryBtnPreParcelTypeOnParcelStepperOB();

            pageManageMyAccount.clickOnSubmitBtnOnParcelStepperOB();
            





    }




}
























