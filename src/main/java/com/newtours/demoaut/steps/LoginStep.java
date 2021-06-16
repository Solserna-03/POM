package com.newtours.demoaut.steps;

import com.newtours.demoaut.pageobject.LoginPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStep {

    LoginPageObject loginPage = new LoginPageObject();

    @Step
    public void abrirPaginaWeb () {
        loginPage.open();
    }

    @Step
    public void ingresarUsuario(String usuario){
        loginPage.getDriver().findElement(loginPage.getTxtUserName()).sendKeys(usuario);
    }
    @Step
    public void ingresarClave (String clave){
        loginPage.getDriver().findElement(loginPage.getTxtPassword()).sendKeys(clave);
    }

    @Step
    public void clicEnSubmit (){
        loginPage.getDriver().findElement(loginPage.getBtnSubmit()).click();
    }

    @Step
    public  void validarMensaje (){
        assertThat(loginPage.getDriver().findElement(loginPage.getMsjValidacion()).isDisplayed(), Matchers.is(true));

    }


}
