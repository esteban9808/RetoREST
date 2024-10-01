package in.reqres.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetListUsers implements Task {
    private final String endPoint;

    public GetListUsers(String endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Get.resource("/api/users?page=2")
        );
    }
    public static GetListUsers getListUser ( String endPoint){
        return  instrumented(GetListUsers.class, endPoint);
    }
}
