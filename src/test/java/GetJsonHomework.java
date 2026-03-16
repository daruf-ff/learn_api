import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class GetJsonHomework {

    @Test
    public void testGetJsonHomework() {

        //получаем полный ответ
        JsonPath responseForGetJson = RestAssured
                .given()
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        //Из полученного ответа берем 2 элемента массива messages
        String message = responseForGetJson.getString("messages[1]");
        //выводит его значение в консоль
        System.out.println(message);
    }
}
