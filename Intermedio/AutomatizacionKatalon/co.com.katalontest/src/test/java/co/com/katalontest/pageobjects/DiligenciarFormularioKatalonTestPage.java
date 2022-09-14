package co.com.katalontest.pageobjects;

import co.com.katalontest.models.KatalonTestData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html")
public class DiligenciarFormularioKatalonTestPage extends PageObject {
    @FindBy (id="first-name")
    WebElementFacade TXT_FIRSTNAME;
    @FindBy (id="last-name")
    WebElementFacade TXT_LASTNAME;
    @FindBy (css="#infoForm > div:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]")
    WebElementFacade RDB_GENERO;
    @FindBy (id="dob")
    WebElementFacade TXT_DOB;
    @FindBy (id="address")
    WebElementFacade TXT_ADDRESS;
    @FindBy (id="email")
    WebElementFacade TXT_EMAIL;
    @FindBy (id="password")
    WebElementFacade TXT_PASSWORD;
    @FindBy (id="company")
    WebElementFacade TXT_COMPANY;
    @FindBy (id="role")
    WebElementFacade LST_ROL;
    @FindBy (id="expectation")
    WebElementFacade SEL_EXPECTATION;
    @FindBy (css="#infoForm > div:nth-child(11) > div > div:nth-child(1) > label > input[type=checkbox]")
    WebElementFacade CHK_WOD;
    @FindBy (id="comment")
    WebElementFacade TXT_COMMENT;
    @FindBy (id="submit")
    WebElementFacade BTN_SUBMIT;
    @FindBy (id="submit-msg")
    WebElementFacade LBL_MENSAJE;


    public void escribirDatos(KatalonTestData data)  {
        TXT_FIRSTNAME.sendKeys(data.getFisrtName());
        TXT_LASTNAME.sendKeys(data.getLastName());
        RDB_GENERO.click();
        TXT_DOB.sendKeys(data.getDateOfBirth());
        TXT_ADDRESS.sendKeys(data.getAddress());
        TXT_EMAIL.sendKeys(data.getEmail());
        TXT_PASSWORD.sendKeys(data.getPassword());
        TXT_COMPANY.sendKeys(data.getCompany());
        LST_ROL.selectByVisibleText(data.getRole());
        SEL_EXPECTATION.selectByVisibleText(data.getJobExpectation());
        CHK_WOD.click();
        TXT_COMMENT.sendKeys(data.getComment());
        BTN_SUBMIT.click();
    }

    public void mensaje(KatalonTestData data) {
        assertThat(LBL_MENSAJE.getText(),containsText(data.getMensaje()));
    }
}
