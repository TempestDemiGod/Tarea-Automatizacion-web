package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Pages.ProductPage;
import com.nttdata.testing.Tasks.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStepDefinition {
    @Given("el {actor} esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @And("selecciona el boton de registro")
    public void seleccionaElBotonDeRegistro() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_SIGN_UP));
    }

    @And("ingresa un nombre de usuario {string} y contrasenia {string}")
    public void ingresaUnNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(HomePage.INP_USERNAME));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(HomePage.INP_PASSWORD));
    }

    @And("selecciona el boton registrar")
    public void seleccionaElBotonRegistrar() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_REGISTRAR));
    }

    @Then("se realiza el registro de manera exitosa")
    public void seRealizaElRegistroDeManeraExitosa() {

    }

    @And("selecciona el boton de inicio sesion")
    public void seleccionaElBotonDeInicioSesion() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_LOGIN));
    }
    @And("ingresa un nombre de usuario {string} y contrasenia {string} para iniciar sesion")
    public void ingresaUnNombreDeUsuarioYContraseniaParaIniciarSesion(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(HomePage.INP_USERNAME_LG));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(HomePage.INP_PASSWORD_LG));
    }

    @And("selecciona el boton login")
    public void seleccionaElBotonLogin() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_INICIARSESION));
    }

    @Then("se realiza el login de manera exitosa")
    public void seRealizaElLoginDeManeraExitosa() {
    }

    @And("selecciona el un producto")
    public void seleccionaElUnProducto() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.LK_PRODUCTO));
    }

    @And("selecciona agregar al carrito")
    public void seleccionaAgregarAlCarrito() {
        theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.BTN_ADD_CART));
    }

    @And("el {actor} esta en la pagina de del producto")
    public void elUsuarioEstaEnLaPaginaDeDelProducto(Actor actor) {
    }
}