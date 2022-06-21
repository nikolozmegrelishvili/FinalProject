package StepsObject;

import PageObject.CheckBox;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;

public class CheckBoxSteps extends CheckBox {
    @Step("selecting Weekdays checkbox, value:{0}")
    public CheckBoxSteps Selecteverything (String title){
        WeekDays.findBy(text(title)).click();
        return this;
    }
}





