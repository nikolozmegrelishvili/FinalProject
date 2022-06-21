package Tests;


import Runner.ChromeRunner;
import Runner.Retry;
import StepsObject.CheckBoxSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.CheckBoxData.*;

@Listeners(Runner.TestLister.class)
public class CheckBoxTest extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("checking the Checkbox")
    public void Checkbox (){
        CheckBoxSteps steps3 = new CheckBoxSteps();
        steps3
                .Selecteverything(A)
                .Selecteverything(B)
                .Selecteverything(C)
                .Selecteverything(D)
                .Selecteverything(E)
                .Selecteverything(F)
                .Selecteverything(G);

    }
}
