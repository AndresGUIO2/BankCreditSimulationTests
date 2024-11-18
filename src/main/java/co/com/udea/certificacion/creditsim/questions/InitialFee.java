package co.com.udea.certificacion.creditsim.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.udea.certificacion.creditsim.userinterfaces.SimulatorModalPage.*;

public class InitialFee implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return INITIAL_FEE.resolveFor(actor).getText();
    }

    public static Question<String> shown() {
        return new InitialFee();
    }
}