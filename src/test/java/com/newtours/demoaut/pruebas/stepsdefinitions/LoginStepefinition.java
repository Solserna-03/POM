package com.newtours.demoaut.pruebas.stepsdefinitions;

import com.newtours.demoaut.models.Datos;
import com.newtours.demoaut.steps.LoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepefinition {

    @Steps
    LoginStep login;

    @Dado("^Thomas esta en la pagina de Mercury Tours$")
    public void thomasEstaEnLaPaginaDeMercuryTours() {
            login.abrirPaginaWeb();

    }

    @Cuando("^Thomas ingresa los datos$")
    public void thomasIngresaLosDatos(List <Datos> datos) {
        login.ingresarUsuario(datos.get(0).getUsuario());
        login.ingresarClave(datos.get(0).getClave());
        login.clicEnSubmit();

    }

    @Entonces("^Thomas valida que se muestre el boton Continue$")
    public void thomasValidaQueSeMuestreElBotonContinue() {
        login.validarMensaje();

    }





}
