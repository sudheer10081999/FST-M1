package liveProject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static au.com.dius.pact.consumer.dsl.PactDslJsonRootValue.numberType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    Map<String, String> headers = new HashMap<>();

    @Pact(consumer = "UserConsumer", provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        headers.put("Content-Type", "application/json");
        DslPart reqResBody = new PactDslJsonBody()
                .numberType("id", 12345)
                .stringType("firstName", "Sudheer")
                .stringType("lastName", "Kumar")
                .stringType("email", "SudheerPydikalva@gmail.com");

        return builder.given("POST Request")
                .uponReceiving("A request to create a user")
                .method("POST")
                .path("/api/users")
                .headers(headers)
                .body(reqResBody)
                .willRespondWith()
                .status(201)
                .body(reqResBody)
                .toPact();
    }


    @Test
    @PactTestFor(providerName = "UserProvider", port = "8282")
    public void postReqestTest() {
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id",12345);
        reqBody.put("firstName","Sudheer");
        reqBody.put("lastName","Kumar");
        reqBody.put("email","SudheerPydikalva@gmail.com");

        given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).log().all().
                when().post().then().statusCode(201).body("email",equalTo("rashmi.psj@ibm.com")).log().all();
    }
}
