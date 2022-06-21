package Tests;

import Runner.ChromeRunner;
import Runner.Retry;
import StepsObject.RegistrationSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.RegistrationData.*;

@Listeners(Runner.TestLister.class)
public class RegistrationTest extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Registration Page testing: clicks, fill-ins")
    @Link(name = "check out", type = "https://selenide.org/documentation.html")
    public void Registration(){
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .Nameclick()
                .Name_on(UserName + LastName)
                .Mobile()
                .Mobile_on(MobileNumber)
                .Email()
                .Email_on(Email)
                .Password()
                .Password_on(Password)
                .Address()
                .Address_on(Address)
                .SubmitButton();


        Assert.assertTrue(steps.NameInput.is(Condition.not(Condition.empty)));
        Assert.assertTrue(steps.MobileInput.is(Condition.not(Condition.empty)));
        Assert.assertTrue(steps.EmailInput.is(Condition.not(Condition.empty)));
        Assert.assertTrue(steps.PasswordInput.is(Condition.not(Condition.empty)));
        Assert.assertTrue(steps.AddressInput.is(Condition.not(Condition.empty)));
        Assert.assertTrue((steps.Submitbutton.is(Condition.enabled)));
    }
}
