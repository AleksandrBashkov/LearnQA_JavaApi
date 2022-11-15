import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

public class HomeWorkLesson2Ex1 {
    @Test
    public void testJsonPars() {

        List response = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath().getList("messages");
        System.out.println(response);

        String secondMessage = RestAssured
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath().getString("messages[1].message");
        System.out.println(secondMessage);
    }
}


