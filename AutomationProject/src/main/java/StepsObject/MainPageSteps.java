package StepsObject;

import PageObject.MainPage;
import io.qameta.allure.Step;

public class MainPageSteps extends MainPage {
    @Step("check border-color")
    public MainPageSteps Bordercolor (){
        Borders.getCssValue("border-color");
        return this;
    }
}
