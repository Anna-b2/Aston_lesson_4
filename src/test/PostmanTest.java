import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.nullValue;

public class PostmanTest {
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }
    @Test
    public void testRequest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
               .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host",equalTo("postman-echo.com"))
                .body("headers.x-request-start",notNullValue())
                .body("headers.connection",equalTo("close"))
                .body("headers.x-forwarded-proto",equalTo("https"))
                .body("headers.x-forwarded-port",equalTo("443"))
                .body("headers.x-amzn-trace-id",notNullValue())
                .body("headers.user-agent",equalTo("Apache-HttpClient/4.5.3 (Java/21.0.2)"))
                .body("headers.accept",equalTo("*/*"))
                .body("headers.postman-token",nullValue())
                .body("headers.accept-encoding",equalTo("gzip,deflate"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }
    @Test
    public void testPostRaw() {
         given()
                Response response = given()
                .log().all()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.").
        .when()
                .post("https://postman-echo.com/post")
       .then()
                .log().all()
                .assertThat().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("cache-control", nullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/post"));
    }
    @Test
    public void testPostData() {
                given()
                .log().all()
                .contentType("application/json")
                .when()
                .post("/post")
                .then()
                .log().all()
                .statusCode(200)
                .body("form.foo1", nullValue())
                .body("form.foo2", nullValue())
                .body("headers.host",equalTo("postman-echo.com"))
                .body("headers.x-request-start",notNullValue())
                .body("headers.connection",equalTo("close"))
                .body("headers.connect-lenght",nullValue())
                .body("headers.x-forwarded-proto",equalTo("https"))
                .body("headers.x-forwarded-port",equalTo("443"))
                .body("headers.x-amzn-trace-id",notNullValue())
                .body("headers.user-agent",equalTo("Apache-HttpClient/4.5.3 (Java/21.0.2)"))
                .body("headers.accept",equalTo("*/*"))
                .body("headers.postman-token",nullValue())
                .body("headers.accept-encoding",equalTo("gzip,deflate,br"))
                .body("headers.cookie",nullValue())
                .body("json.foo1", nullValue())
                .body("json.foo2", nullValue())
                .extract().response();
    }
    @Test
    public void testPatchRequest() {
        given()
                .log().all()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.host",equalTo("postman-echo.com"))
                .body("headers.x-request-start",notNullValue())
                .body("headers.connection",equalTo("close"))
                .body("headers.connect-lenght",nullValue())
                .body("headers.x-forwarded-proto",equalTo("https"))
                .body("headers.x-forwarded-port",equalTo("443"))
                .body("headers.x-amzn-trace-id",notNullValue())
                .body("headers.user-agent",equalTo("Apache-HttpClient/4.5.3 (Java/21.0.2)"))
                .body("headers.accept",equalTo("*/*"))
                .body("headers.postman-token",nullValue())
                .body("headers.accept-encoding",equalTo("gzip,deflate,br"))
                .body("headers.cookie",nullValue())
                .extract().response();
    }
 @Test
    public void testPutRequest() {
    given()
                .log().all()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then()
                .log().all()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.host",equalTo("postman-echo.com"))
                .body("headers.x-request-start",notNullValue())
                .body("headers.connection",equalTo("close"))
                .body("headers.connect-lenght",nullValue())
                .body("headers.x-forwarded-proto",equalTo("https"))
                .body("headers.x-forwarded-port",equalTo("443"))
                .body("headers.x-amzn-trace-id",notNullValue())
                .body("headers.user-agent",equalTo("Apache-HttpClient/4.5.3 (Java/21.0.2)"))
                .body("headers.accept",equalTo("*/*"))
                .body("headers.postman-token",nullValue())
                .body("headers.accept-encoding",equalTo("gzip,deflate,br"))
                .body("headers.cookie",nullValue())
                .extract().response();
    @Test
    public void testDelete() {
                given()
                .log().all()
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept", equalTo("*/*"))
                .body("cache-control", nullValue())
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/delete"));
}
