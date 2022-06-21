package Tests;

import Runner.ChromeRunner;
import Runner.Retry;
import StepsObject.RadioButtonsSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Runner.TestLister.class)
public class RadioButtonsTest extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Selecting individual Radio buttons")
    public void RadioButtons(){
        RadioButtonsSteps steps2 = new RadioButtonsSteps();
        steps2
                .GenderHover()
                .SelectFemale()
                .SelectOther()
                .SelectMale();
        Assert.assertTrue(steps2.Gender.is(Condition.visible));
        Assert.assertTrue(steps2.otherOption.is(Condition.disabled));
    }
}
