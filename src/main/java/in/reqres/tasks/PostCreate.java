package in.reqres.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PostCreate implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {
         String BODY = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        t.attemptsTo(
                Post.to("/api/users")
                        .with(request -> request
                                .body(BODY)
                        ));
        String response = t.asksFor(LastResponse.received()).asString();
        System.out.println("Request body: "+ BODY);
        //String statusCode = String.valueOf(SerenityRest.lastResponse().statusCode());
        System.out.println("Complete response validate: " +response);
    }
    public static PostCreate access () {
        return instrumented(PostCreate.class);
    }
}
