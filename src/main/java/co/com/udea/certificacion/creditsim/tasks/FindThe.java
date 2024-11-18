package co.com.udea.certificacion.creditsim.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.creditsim.userinterfaces.HomeLoanPage.*;


public class FindThe implements Task {
    private final String elementToFind;

    public FindThe(String elementToFind) {
        this.elementToFind = elementToFind;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (elementToFind.toLowerCase()) {
            case "loan button":
                actor.attemptsTo(Click.on(LOAN_BUTTON));
                break;
            case "google logo":
                actor.attemptsTo(Click.on(GOOGLE_LOGO));
                break;
        }
    }

    public static FindThe element(String elementToFind) {
        return Tasks.instrumented(FindThe.class, elementToFind);
    }

    public static FindThe loanButton() {
        return Tasks.instrumented(FindThe.class, "loan button");
    }

    public static FindThe googleLogo() {
        return Tasks.instrumented(FindThe.class, "google logo");
    }
}