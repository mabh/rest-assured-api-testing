import static com.jayway.restassured.RestAssured.post;

public class POSTTest {
	public static void main(String[] args) {
		try { 
			post("http://mockbin.org/bin/fe2b57a8-67ef-4f22-8f3a-0f7a33c74d72?foo=bar&foo=bar1")
				.then()
					.statusCode(400);
					//.body("Books.Title", hasItems("Groovy 2 Cookbook"));
			System.out.println("Pass");
		} catch(Throwable t) {
			System.out.println(">>>" + t.getMessage());
		}
	}
}
