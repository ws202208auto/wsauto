package co.com.eribank.pageobjects;

import co.com.eribank.utils.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MakePaymentEribankPage extends MobilePageObject {
    public MakePaymentEribankPage(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id="com.experitest.ExperiBank:id/makePaymentButton")
    WebElement BTN_MAKE_PAYMENT;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/phoneTextField")
    WebElement TXT_PHONE;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/nameTextField")
    WebElement TXT_NAME;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/amount")
    WebElement AMOUNT;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/countryTextField")
    WebElement TXT_COUNTRY;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/sendPaymentButton")
    WebElement BTN_SEND_PAYMENT;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Yes\")")
    WebElement BTN_CONFIRM_PAYMENT;


    public void ingresarDatosDelPago(List<String> data) {
        BTN_MAKE_PAYMENT.click();
        TXT_PHONE.sendKeys(data.get(0));
        TXT_NAME.sendKeys(data.get(1));
        AMOUNT.click();
        TXT_COUNTRY.sendKeys(data.get(2));
        BTN_SEND_PAYMENT.click();
        BTN_CONFIRM_PAYMENT.click();
    }
}
