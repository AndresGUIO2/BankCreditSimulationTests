package co.com.udea.certificacion.creditsim.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeLoanPage {
    public static final Target GOOGLE_LOGO = Target.the("Google logo image")
            .locatedBy("//img[@class='lnXdpd'][@alt='Google']");

    public static final Target LOAN_BUTTON = Target.the("Home loan button")
            .locatedBy("//a[@data-lfr-editable-id='05-link'][text()='Pídelo ahora']");

    public static final Target SIMULATOR_OPTION = Target.the("Simulator option in navigation")
            .locatedBy("//*[@id='m-option-2']");

    public static final Target INCOME_TAB = Target.the("Income based simulation tab")
            .locatedBy("//*[text()='Tus ingresos']");

    public static final Target MONTHLY_INCOME_INPUT = Target.the("Monthly income input field")
            .locatedBy("//*[@id='input1']//input[@type='DECIMALAMOUNT']");

    public static final Target AGE_INPUT = Target.the("Age input field")
            .locatedBy("//*[@id='input2']//input[@type='NUMBER']");

    public static final Target CALCULATE_BUTTON = Target.the("Calculate button")
            .locatedBy("//*[@id='calcular']");
}

