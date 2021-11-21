package com.co.grupobabel.questions;

import com.co.grupobabel.models.calculatorModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheElement implements Question<Boolean> {

    private Target element;
    calculatorModel listcalculatorModel;

    public TheElement(Target element, calculatorModel listcalculatorModel) {
        this.element = element;
        this.listcalculatorModel = listcalculatorModel;
    }

    public static TheElement result(Target element, calculatorModel listcalculatorModel)
    {
        return new TheElement(element,listcalculatorModel);
    }

    @Override
    public Boolean answeredBy(Actor actor){

        String elem = element.resolveFor(actor).getValue();
        if(elem.equals(listcalculatorModel.getAnswer())){
            return true;
        }else{
            return false;
        }

    }
}
