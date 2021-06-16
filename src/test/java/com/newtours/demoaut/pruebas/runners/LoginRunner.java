package com.newtours.demoaut.pruebas.runners;


import      cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.newtours.demoaut.pruebas.features/login.feature",
        glue = "com.newtours.demoaut.pruebas.stepsdefinitions",
        snippets = SnippetType.CAMELCASE)
public class LoginRunner {

}
