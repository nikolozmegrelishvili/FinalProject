package StepsObject;

import PageObject.SelectOption;
import io.qameta.allure.Step;

public class SelectOptionSteps extends SelectOption {
    @Step("select every option")
    public SelectOptionSteps SelectDropDown(){
        for (int i = 0; i <11; i++){
            DropDown.selectOption(i);
        }
        return this;
    }
}
