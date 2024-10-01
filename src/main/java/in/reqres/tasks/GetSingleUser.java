package in.reqres.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetSingleUser implements Task {
    private final String endPoint;

    public GetSingleUser(String endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Get.resource("/api/users/2")
        );
    }
    public static GetSingleUser getSingleUser ( String endPoint){
        return  instrumented(GetSingleUser.class, endPoint);
    }
}
