package starter.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import starter.APICalls.ProductAPI;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProductStepDefinitions {

    @Steps
    public ProductAPI productAPI;

    @When("{actor} gets the details for {string}")
    public void heCallsEndpoint(Actor actor,String product) {
        productAPI.getDetailsForProduct(product);
    }

    @Then("{actor} sees the results displayed for {string}")
    public void heSeesTheResultsDisplayedForApple(Actor actor,String product) {
        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.extract().body().jsonPath().get("title").toString().contains(product));
    }

    @Then("{actor} does not see the results")
    public void he_Does_Not_See_The_Results(Actor actor) {
        restAssuredThat(response -> response.extract().body().jsonPath().get("detail").toString().contains("\"error\":true"));
    }


}
