package com.co.grupobabel.runners;


import com.co.grupobabel.utils.excel.BeforeSuite;
import com.co.grupobabel.utils.excel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/basic_calculator.feature",
        glue = {"com.co.grupobabel.stepdefinitions", "com.co.grupobabel.hooks"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Test"

)

public class basicCalculatorRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/basic_calculator.feature");
    }
}
