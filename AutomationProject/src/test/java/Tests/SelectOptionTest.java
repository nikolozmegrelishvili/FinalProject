package Tests;

import Runner.ChromeRunner;
import Runner.Retry;
import StepsObject.SelectOptionSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Runner.TestLister.class)
public class SelectOptionTest extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("selecting options of DropDown")
    public void SelectOption(){
        SelectOptionSteps steps4 = new SelectOptionSteps();
        steps4
                .SelectDropDown();

        Assert.assertTrue(steps4.DropDown.isSelected());
    }
}
