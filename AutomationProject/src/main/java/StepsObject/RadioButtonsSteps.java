package StepsObject;

import PageObject.RadioButtons;
import io.qameta.allure.Step;

public class RadioButtonsSteps extends RadioButtons {
    @Step("hover over visible Gender text")
    public RadioButtonsSteps GenderHover(){
        Gender.hover();
        return this;
    }
    @Step("select Female Radio button")
    public RadioButtonsSteps SelectFemale(){
        RadioOptions.selectRadio("Female");
        return this;
    }
    @Step("click on Other Radio button")
    public RadioButtonsSteps SelectOther(){
      otherOption.click();
      return this;
    }
    @Step("select Male Radio button")
    public RadioButtonsSteps SelectMale(){
        RadioOptions.selectRadio("Male");
        return this;
    }
}
