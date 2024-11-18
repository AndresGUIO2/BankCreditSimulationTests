package co.com.udea.certificacion.creditsim.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable bancoDeBogota() {
        return Task.where("{0} opens the BancoDeBogota home page", Open.browserOn().the(BancoDeBogotaHomePage.class));
    }
}