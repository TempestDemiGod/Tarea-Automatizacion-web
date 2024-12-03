package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target BTN_ADD_CART = Target.the("Boton para añadir al carrito").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

}
