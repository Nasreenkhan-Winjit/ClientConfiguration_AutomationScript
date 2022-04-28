package pages;

import com.google.inject.internal.cglib.core.$WeakCacheKey;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.commonmodule.Loader;
import pages.commonmodule.Login;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class PageClientConfiguration extends BasePage {

    //    Actions actions;
    private Loader loader;
    private WebDriver webDriver;
    private RemoteWebDriver remoteWebDriver;

    public PageClientConfiguration(WebDriver webDriver) {
        super(webDriver);

        this.webDriver = webDriver;
        loader = new Loader(driver);
    }

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//input[@id='BilledTo']")
    private WebElement elementTxtSearchbilledto;

    @CacheLookup
    @FindBy(how = How.XPATH, using = "//div[@role='listitem'][1]//a[@class='v-list__tile v-list__tile--link theme--light']")
    private WebElement elementMenuBilledToClick;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Search')]")
    private WebElement clickOnSearchButton;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Outbound - Domestic')]")
    private WebElement elementOutboundDomestic1;

    @FindBy(how = How.XPATH, using = "//tbody//td[6]/a[1]/i[@class='mdi mdi-pencil mdi-18px']")
    private WebElement elementClickOnEditIcon;

    //    @FindBy(how = How.XPATH, using= "//tbody")
    @FindBy(how = How.XPATH, using = "//tbody//tr")
    private List<WebElement> elementOutboundDomestic;

    @FindBy(how = How.XPATH, using = "tbody//tr[i]//td[6]/a[1]/i[@class='mdi mdi-pencil mdi-18px']")
    private WebElement elementClickOnEditActionIcon;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[@class='v-btn v-btn--outline v-btn--depressed theme--light primary--text']")
    private WebElement elementSenderEditButtonOB;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[@class='v-input--selection-controls__ripple']")
    private WebElement elementSenderComponentToggleBtn;

    @FindBy(how = How.XPATH, using = "//div//i[contains(text(),'cancel')]")
    private WebElement elementClickOnCancelButtonOnSenderNameField;

    @FindBy(how = How.XPATH, using = "//div[@class='v-input v-text-field v-text-field--box v-text-field--enclosed v-text-field--placeholder v-select v-select--chips v-select--chips--small v-autocomplete v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']")
    private WebElement elementClickOnSenderNameField;


    @FindBy(how = How.XPATH, using = "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='listitem'][1]")
    private WebElement elementSelectSearchedSenderNameOB;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/button[1]/div[contains(text(),'Edit')]")
    private WebElement elementClickEditButtonOnReceiverComponent;

    @FindBy(how = How.XPATH, using = "//div[@class='v-input v-text-field v-text-field--box v-text-field--enclosed v-text-field--placeholder v-select v-select--chips v-select--chips--small v-autocomplete v-input--is-disabled theme--light']//div[@class='v-select__selections']")
    private WebElement elementClickOnReceiverNameField;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/button[1]")
    private WebElement elementClickOnEditBtnOnRequirementStepper;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[@class='v-input--selection-controls__ripple']")
    private WebElement elementEnableToggleBtnOnRequirementStepper;

    @FindBy(how = How.XPATH,using = "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-select--chips v-select--is-menu-active v-autocomplete v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text combobox_label-black ']//div//div")
    private WebElement elementInputShipperReferences;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/button[1]")
    private WebElement elementEditBtnOnServiceStepperOB;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement elementClickServiceOnFieldRestrictions;


    @FindBy(how = How.XPATH, using = "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='listitem'][2]")
    private WebElement elementSelectServiceOnFieldRestrictionsNextDay10H30;

    @FindBy(how = How.XPATH, using = "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']//div[@role='listitem'][4]")
    private WebElement elementSelectServiceOnFieldRestrictionsValuableCargo;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement elementClickOnSurchargesFieldOB;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/div[1]/button[1]")
    private WebElement elementClickOnParcelStepperEditButtonOB;

    @FindBy(how = How.XPATH, using = "//tbody/tr[3]/td[8]/span[1]/input[1]")
    private WebElement elementClickOnRadioBtnOnParcelStepSelect3OB;

    @FindBy(how = How.XPATH, using = "//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]")
    private WebElement elementClickOnNewEntryBtnOnPreParcelTypeOB;

   @FindBy(how = How.XPATH, using = "//div[contains(text(),'Submit')]")
    private WebElement elementClickOnSubmitBtnOB;








    @Step("Enter txt consignment : \"{0}\"")
    public void enterTxtSearchBilledto(String txt, Keys keys) {
//        loader.waitForLoaderToDispose();
        webDriverWait.until(ExpectedConditions.visibilityOf(elementTxtSearchbilledto));
        elementTxtSearchbilledto.sendKeys(Keys.CONTROL + "a");
        elementTxtSearchbilledto.sendKeys(Keys.DELETE);
        elementTxtSearchbilledto.sendKeys(txt, keys);
//        actions.sendKeys();
    }

    @Step("click on menu from list ")
    public void selectBilledToFromList() {

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementMenuBilledToClick));
        elementMenuBilledToClick.click();


    }

    @Step("click on search button")
    public void clickONSearchButton() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(clickOnSearchButton));
        clickOnSearchButton.click();
    }

    @Step("elementOutboundDomestic")
    public void SearchForElementOutboundDomestic() {
        webDriverWait.until(ExpectedConditions.visibilityOf(elementOutboundDomestic1));
        elementOutboundDomestic1.isDisplayed();
//      return elementOutboundDomestic.getSize();

    }

    public void numberOfRowsDisplayed() {

        List<String> listNoOfRows = new ArrayList<>();
        System.out.println(elementOutboundDomestic.size() + " Row Size.");
        int row=-1;
        for(int i=1;i<=elementOutboundDomestic.size();i++)
        {
            WebElement outboundElement = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]"));
            System.out.println(outboundElement.getAttribute(""));
            System.out.println(outboundElement.getText());
            if(outboundElement.getText().equalsIgnoreCase("Outbound - Domestic"))
            {
                row=i;
                break;
            }

        }

        System.out.println(row + " row contains outbound.");
        if(row!=-1) {
            WebElement actionElement = driver.findElement(By.xpath("//tbody//tr[" + row + "]//td[6]/a[1]/i[@class='mdi mdi-pencil mdi-18px']"));
            actionElement.click();
            System.out.println("Clicked contains outbound.");
        }

    }


    @Step("elementClickOnEditIcon")
    public void clickOnElementEditIcon() {
        webDriverWait.until(ExpectedConditions.visibilityOf(elementClickOnEditIcon));
        elementClickOnEditIcon.click();

    }


    @Step("element Click on Sender stepper Edit button")
    public void clickOnSenderEditButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(elementSenderEditButtonOB));
        elementSenderEditButtonOB.click();
    }

    @Step("element verify sender component toggle btn is active")
    public boolean clickOnSenderComponentToggleBtn() {
        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(elementSenderComponentToggleBtn));
            System.out.println("Toggle button is enabled " +elementSenderComponentToggleBtn.isEnabled());
            return true;
        } catch (Exception e) {
            return false;
        }

    }



    @Step("Element click on Sender Name cancel icon and ")
    public void clickOnToggleButtonSenderStepper(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementSenderComponentToggleBtn));
        elementSenderComponentToggleBtn.click();

    }

    @Step("Element click on Sender Name cancel icon and restrict to one")
    public void clickOnCancelIconOnSenderNameField(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnCancelButtonOnSenderNameField));
        elementClickOnCancelButtonOnSenderNameField.click();

    }
  @Step("Element click on Sender Name cancel icon and restrict to one")
    public void clickOnSenderNameField(String txt){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnSenderNameField));
      elementClickOnSenderNameField.click();
      elementClickOnSenderNameField.sendKeys(txt);


      webDriverWait.until(ExpectedConditions.visibilityOf(elementSelectSearchedSenderNameOB));
      elementSelectSearchedSenderNameOB.click();
    }

    @Step("Element click on Receiver component ")
    public void clickOnEditButtonOnReceiverComponent(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickEditButtonOnReceiverComponent));
        elementClickEditButtonOnReceiverComponent.click();

    }

   @Step(" Element click on Receiver component ")
    public void clickOnReceiverNameField(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnReceiverNameField));
       elementClickOnReceiverNameField.click();

    }

    @Step("Element Click on Edit Button on Requirement Stepper")
    public void clickOnEditBtnRequirementStepper(){

        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnEditBtnOnRequirementStepper));
        elementClickOnEditBtnOnRequirementStepper.click();

    }
    @Step("Element Click on Edit Button on Requirement Stepper")
    public boolean clickOnToggleBtnOnRequirementStepper(){

//        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementEnableToggleBtnOnRequirementStepper));
//        elementEnableToggleBtnOnRequirementStepper.click();

        WebElement RequirementToggleBtn =webDriver.findElement(By.xpath("//body/div[@id='inspire']/div[18]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[@class='v-input--selection-controls__ripple']"));
        System.out.println("Toggle button is enabled " + RequirementToggleBtn.isEnabled());
        return RequirementToggleBtn.isEnabled();

    }



    @Step("Element Click on toggle button")
    public void clickOnToggleBtnOnRRequirementsComponentVisible(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementEnableToggleBtnOnRequirementStepper));
        elementEnableToggleBtnOnRequirementStepper.click();

    }

    @Step("Element provide input on shipper reference field")
    public void enterTxtOnShipperReferenceField(String txt){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementInputShipperReferences));
        elementInputShipperReferences.sendKeys(txt);
        elementInputShipperReferences.sendKeys(Keys.TAB);

    }

    @Step("Element edit btn on service stepper - outbound")
    public void clickOnEditBtnOnServiceStepper(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementEditBtnOnServiceStepperOB));
        elementEditBtnOnServiceStepperOB.click();

    }


  @Step("Element select service - outbound")
    public void clickOnServiceOnFieldRestrictionsOB(){
      webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickServiceOnFieldRestrictions));
      elementClickServiceOnFieldRestrictions.click();
// select service1
      webDriverWait.until(ExpectedConditions.elementToBeClickable(elementSelectServiceOnFieldRestrictionsNextDay10H30));
      elementSelectServiceOnFieldRestrictionsNextDay10H30.click();
// select service2
      webDriverWait.until(ExpectedConditions.elementToBeClickable(elementSelectServiceOnFieldRestrictionsValuableCargo));
      elementSelectServiceOnFieldRestrictionsValuableCargo.click();

    }


    @Step("Element click on surcharges field")
    public void clickOnSurchargesFieldOB(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnSurchargesFieldOB));
        elementClickOnSurchargesFieldOB.click();

    }


    @Step("Element click on parcel stepper ")
    public void clickOnEditBtnOnParcelStepperOB(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnParcelStepperEditButtonOB));
        elementClickOnParcelStepperEditButtonOB.click();
    }

     @Step("Element click on Parcel Parameters -parcel stepper ")
    public void clickOnRadioBtn3OnParcelStepperOB(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnRadioBtnOnParcelStepSelect3OB));
         elementClickOnRadioBtnOnParcelStepSelect3OB.click();
    }


    @Step("Element click on New Entry btn on Pre-set Parcel Types  parcel step ")
    public void clickOnNewEntryBtnPreParcelTypeOnParcelStepperOB(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnNewEntryBtnOnPreParcelTypeOB));
        elementClickOnNewEntryBtnOnPreParcelTypeOB.click();

    }

    @Step("Element click on Pre-set Parcel Types on parcel step ")
    public void clickOnSubmitBtnOnParcelStepperOB(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(elementClickOnNewEntryBtnOnPreParcelTypeOB));
        elementClickOnNewEntryBtnOnPreParcelTypeOB.click();

    }














































    @Override
    public void scrollToElement(WebElement webElement) {
        super.scrollToElement(webElement);
    }

    @Step("Verify the message displayed with following text")
    public boolean verifySenderFieldRestricted() {
        try {
            WebElement senderRestricted = webDriver.findElement(By.xpath("//div[contains(text(),'Sender is restricted, please select one from the list. Note: The list displays a maximum of 8 results.')]"));
//        return senderRestricted.isDisplayed();
//            System.out.println(senderRestricted.isDisplayed() + "Message displayed");
            return true;

        } catch (Exception e) {
            return false;


        }

//        System.out.println("senderRestricted.isDisplayed()");

    }


    @Step("Verify the Rica is not present")
    public boolean verifyRicaIsNotPresent() {
        try {
            WebElement Rica = webDriver.findElement(By.xpath("//button[@id='RICA']"));
            System.out.println("Rica is not present" + Rica.isDisplayed());
            return Rica.isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }


}




