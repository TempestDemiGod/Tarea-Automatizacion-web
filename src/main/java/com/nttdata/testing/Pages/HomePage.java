package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {
    // SIGN UP
    public static final Target BTN_SIGN_UP = Target.the("Boton para hacer el registro").located(By.id("signin2"));
    public static final Target REGISTER_MODAL = Target.the("Modal de registro").located(By.id("signInModalLabel"));
    public static final Target INP_USERNAME = Target.the("Nombre de usuario").located(By.id("sign-username"));
    public static final Target INP_PASSWORD = Target.the("Contraseña").located(By.id("sign-password"));
    public static final Target BTN_REGISTRAR = Target.the("Boton Registrar").located(By.xpath("//button[text()='Sign up']"));
    // LOG IN
    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion").located(By.id("login2"));
    public static final Target INP_USERNAME_LG = Target.the("Nombre de usuario").located(By.id("loginusername"));
    public static final Target INP_PASSWORD_LG = Target.the("Contraseña").located(By.id("loginpassword"));
    public static final Target BTN_INICIARSESION =Target.the("Boton iniciar sesion").located(By.xpath("//button[text()='Log in']"));
    //seleccionar producto
    public static final Target LK_PRODUCTO = Target.the("Boton Producto").located(By.xpath("//*[@id='tbodyid']/div[1]/div/a"));


}