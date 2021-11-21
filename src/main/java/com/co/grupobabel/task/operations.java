package com.co.grupobabel.task;

import com.co.grupobabel.interactions.WaitFor;
import com.co.grupobabel.models.calculatorModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.grupobabel.userinterfaces.calculatorUI.*;

public class operations implements Task {

    calculatorModel listcalculatorModel;

    public operations(calculatorModel listcalculatorModel) {
        this.listcalculatorModel = listcalculatorModel;
    }

    public static operations calculate(calculatorModel listcalculatorModel){
        return Tasks.instrumented(operations.class, listcalculatorModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Scroll.to(UBICATION_FORM));
        actor.attemptsTo(Click.on(BUILD_SELECT));
        actor.attemptsTo(Click.on(VALUEBUILD_SELECT.of(listcalculatorModel.getBuild())));
        actor.attemptsTo(Enter.theValue(listcalculatorModel.getFirst_number()).into(NUMBER_ONE_INPUT));
        actor.attemptsTo(Enter.theValue(listcalculatorModel.getSecond_number()).into(NUMBER_SECOND_INPUT));
        actor.attemptsTo(Click.on(OPERATOR_SELECT));
        actor.attemptsTo(Click.on(VALUEOPERATOR_SELECT.of(listcalculatorModel.getOperation())));
        actor.attemptsTo(Click.on(CALCULATE_BUTTON));
        actor.attemptsTo(WaitFor.seconds(5));

    }
}
