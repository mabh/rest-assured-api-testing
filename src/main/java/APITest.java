import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.*;


public class APITest {
	public static void main(String[] args) {
		try { 
			get("http://it-ebooks-api.info/v1/search/groovy")
				.then()
					.statusCode(400)
					.body("Books.Title", hasItems("Groovy 2 Cookbook"));
			System.out.println("Pass");
		} catch(Throwable t) {
			System.out.println(">>>" + t.getMessage());
		}
	}
}
