package co.com.udea.certificacion.creditsim.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.udea.certificacion.creditsim.userinterfaces.HomeLoanPage.*;

public class EnterThe implements Task {
    private final String value;
    private final Target target;

    public EnterThe(String value, Target target) {
        this.value = value;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(value).into(target)
        );
    }

    public static EnterThe income(String value) {
        return Tasks.instrumented(EnterThe.class, value, MONTHLY_INCOME_INPUT);
    }

    public static EnterThe age(String value) {
        return Tasks.instrumented(EnterThe.class, value, AGE_INPUT);
    }
}