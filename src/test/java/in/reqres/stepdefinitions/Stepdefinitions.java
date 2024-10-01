package in.reqres.stepdefinitions;

import in.reqres.questions.ResponseCode;
import in.reqres.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static in.reqres.constants.constants.URL_BASE_REQRES;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class Stepdefinitions {
    private  static final String restAPI= URL_BASE_REQRES;
    @When("I consume the endpoint {string}")
    public void iConsumeTheEndpoint(String endpoint) {
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPI));
        user.attemptsTo(
                GetListUsers.getListUser(endpoint)
        );

    }
    @Then("I can validate the answer service {int}")
    public void iCanValidateTheAnswerService(Integer code) {
        Actor user= Actor.named("user");

        user.should(
                seeThat(
                        "The response code is", ResponseCode.code(),equalTo(code) //ResponseCode.was(),equalTo(code)
                )
        );
    }
    @When("I consume the endpointt {string}")
    public void iConsumeTheEndpointt(String endpoint) {
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPI));
        user.attemptsTo(
                GetSingleUser.getSingleUser(endpoint)
        );

    }
    @Then("I can validate the answer servicee {int}")
    public void iCanValidateTheAnswerServicee(Integer code) {
        Actor user= Actor.named("user");

        user.should(
                seeThat(
                        "The response code is", ResponseCode.code(),equalTo(code) //ResponseCode.was(),equalTo(code)
                )
        );

    }


    @When("t I consume the endpoint, I send the information")
    public void tIConsumeTheEndpointISendTheInformation() {
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPI));
        user.attemptsTo(
                PostCreate.access()
        );
    }

    @When("I consume the endpoint, I send the information")
    public void iConsumeTheEndpointISendTheInformation() {
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPI));
        user.attemptsTo(
                PostRegister.register()
        );
    }

    @When("I consume the endpoint of login, I send the information")
    public void iConsumeTheEndpointOfLoginISendTheInformation() {
        Actor user= Actor.named("user")
                .whoCan(CallAnApi.at(restAPI));
        user.attemptsTo(
                PostLogin.login()
        );
    }

}
