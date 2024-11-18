package co.com.udea.certificacion.creditsim.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.udea.certificacion.creditsim.userinterfaces.SimulatorModalPage.*;

public class InterestRate implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return ANNUAL_RATE.resolveFor(actor).getText();
    }

    public static Question<String> shown() {
        return new InterestRate();
    }
}