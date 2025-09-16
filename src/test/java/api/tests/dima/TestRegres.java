package api.tests.dima;

import api.base.Specifications;
import api.pojo.Registration;
import api.pojo.SingleUserPojo;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import static io.restassured.RestAssured.given;

public class TestRegres {

    protected Specifications specifications = new Specifications();
    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecification;

    protected SingleUserPojo reqwestSingleUserPojo = new SingleUserPojo("Neo", "Matrica pioner");
    protected Registration registration = new Registration("eve.holt@reqres.in", "pistolet");


    {
        requestSpecification = specifications.setupRequest();
        responseSpecification = specifications.setupResponse();
    }

    @Test
    public void testListOfUsersIdExisted(){

        Response response = given(requestSpecification,responseSpecification).
                get("/api/users?page=2").
                then().
                statusCode(200).
                extract().
                response();

        List <Integer> listOfUsersId = response.jsonPath().getList("data.id");
        Assert.assertEquals(List.of(7,8,9,10,11,12), listOfUsersId);
    }
}
