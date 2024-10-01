package in.reqres.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PostLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        String BODY = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}";


        t.attemptsTo(
                Post.to("/api/login")
                        .with(request -> request
                                .body(BODY)
                        ));

        String response = t.asksFor(LastResponse.received()).asString();
        System.out.println("Request body: "+ BODY);
        System.out.println("Complete response validate: " +response);
    }

    public static PostLogin login () {
        return instrumented(PostLogin.class);
    }
}
