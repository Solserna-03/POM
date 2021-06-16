package com.newtours.demoaut.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

    @DefaultUrl("http://demo.guru99.com/test/newtours/")
public class LoginPageObject extends pageObject{

    By txtUserName = By.name("userName");
    By txtPassword = By.name("password");
    By btnSubmit = By.name("submit");
    By msjValidacion = By.xpath("//h3[contains(text(),'Login Successfully')]");

    public By getTxtUserName() {
        return txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getMsjValidacion() {
        return msjValidacion;
    }

}
