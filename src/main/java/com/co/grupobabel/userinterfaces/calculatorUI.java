package com.co.grupobabel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class calculatorUI {

    public static final Target UBICATION_FORM = Target.the("Ubication Form").locatedBy("//p[contains(text(),'If you')]");

    public static final Target BUILD_SELECT = Target.the("Build Select").located(By.id("selectBuild"));

    public static final Target VALUEBUILD_SELECT = Target.the("value build select").locatedBy("//*[@id='selectBuild']//option[text()='{0}']");

    public static final Target NUMBER_ONE_INPUT = Target.the("Number one input").located(By.id("number1Field"));

    public static final Target NUMBER_SECOND_INPUT = Target.the("Number second input").located(By.id("number2Field"));

    public static final Target OPERATOR_SELECT = Target.the("Operator select").located(By.id("selectOperationDropdown"));

    public static final Target VALUEOPERATOR_SELECT = Target.the("value operator select").locatedBy("//*[@id='selectOperationDropdown']//option[text()='{0}']");

    public static final Target CALCULATE_BUTTON = Target.the("Calculate button").located(By.id("calculateButton"));

    public static final Target ANSWER_INPUT = Target.the("Answer input").located(By.id("numberAnswerField"));
}
