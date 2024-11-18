package co.com.udea.certificacion.creditsim.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.udea.certificacion.creditsim.userinterfaces.SimulatorModalPage.*;

public class LoanAmount implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return LOAN_AMOUNT.resolveFor(actor).getText();
    }

    public static Question<String> shown() {
        return new LoanAmount();
    }
}
