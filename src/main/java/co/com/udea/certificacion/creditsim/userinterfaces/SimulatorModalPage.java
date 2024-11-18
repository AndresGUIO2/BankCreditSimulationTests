package co.com.udea.certificacion.creditsim.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SimulatorModalPage {
    public static final Target MODAL_INCOME_INPUT = Target.the("Modal monthly income input")
            .locatedBy("//*[@id='at-input-incomes']//input");

    public static final Target MODAL_AGE_INPUT = Target.the("Modal age input")
            .locatedBy("//*[@id='at-input-age-first-applicant']//input");

    public static final Target LOAN_TERM_20_YEARS = Target.the("20 years loan term selector")
            .locatedBy("//*[@id='button-20']");

    public static final Target LOAN_AMOUNT = Target.the("Loan amount text")
            .locatedBy("//*[@id='simulation-value']");

    public static final Target MONTHLY_PAYMENT = Target.the("Monthly payment amount")
            .locatedBy("//*[@id='monthly-payment-value']");

    public static final Target ANNUAL_RATE = Target.the("Annual interest rate")
            .locatedBy("//*[@effectiveannualratevalue]");

    public static final Target INITIAL_FEE = Target.the("Initial fee amount")
            .locatedBy("//*[@initialfeevalue]");
}