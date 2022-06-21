package StepsObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationSteps extends RegistrationPage {
    @Step("click Name input")
    public RegistrationSteps Nameclick(){
        NameInput.click();
        return this;
    }
    @Step("fill Name input, value:{0}")
    public RegistrationSteps Name_on(String username){
        NameInput.setValue(username);
         return this;
    }
    @Step("click Mobile Number input")
    public RegistrationSteps Mobile(){
        MobileInput.click();
        return this;
    }
    @Step("fill Mobile Nuber input, value: {0}")
    public RegistrationSteps Mobile_on(String mobile){
        MobileInput.setValue(mobile);
        return this;
    }
    @Step("click Email address input")
    public RegistrationSteps Email(){
        EmailInput.click();
        return this;
    }
    @Step("fill Email address input, value:{0}")
    public RegistrationSteps Email_on(String email){
        EmailInput.setValue(email);
        return this;
    }
    @Step("click Password")
    public RegistrationSteps Password (){
        PasswordInput.click();
        return this;
    }
    @Step("fill Password, value:{0}")
    public RegistrationSteps Password_on (String password){
        PasswordInput.setValue(password);
        return this;
    }
    @Step("click Address")
    public RegistrationSteps Address (){
        AddressInput.click();
        return this;
    }
    @Step("fill Address, value:{0}")
    public RegistrationSteps Address_on (String address){
        AddressInput.setValue(address);
        return this;
    }
    @Step("click SUBMIT")
    public RegistrationSteps SubmitButton (){
        Submitbutton.click();
        return this;
    }
}
