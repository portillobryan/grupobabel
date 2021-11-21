package com.co.grupobabel.stepdefinitions;

import com.co.grupobabel.drivers.Driver;
import com.co.grupobabel.models.calculatorModel;
import com.co.grupobabel.questions.TheElement;
import com.co.grupobabel.task.operations;
import com.co.grupobabel.utils.constants.General;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.grupobabel.userinterfaces.calculatorUI.ANSWER_INPUT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class basicCalculatorStepDefinitions {
    @Given("^the user enters main page$")
    public void theUserEntersMainPage() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.inThePage(General.URL)));
    }

    @When("^the user performs the operations on the calculator$")
    public void theUserPerformsTheOperationsOnTheCalculator(List<calculatorModel> ListcalculatorModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(operations.calculate(ListcalculatorModel.get(0)));

    }

    @Then("^the user makes the calculation successfully$")
    public void theUserMakesTheCalculationSuccessfully(List<calculatorModel> ListcalculatorModel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheElement.result(ANSWER_INPUT,ListcalculatorModel.get(0))));
    }
}
