package co.com.udea.certificacion.creditsim.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.udea.certificacion.creditsim.userinterfaces.SimulatorModalPage.*;

public class SelectThe implements Task {

    public SelectThe(String term) {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOAN_TERM_20_YEARS)
        );
    }

    public static SelectThe loanTerm(String term) {
        return Tasks.instrumented(SelectThe.class, term);
    }
}