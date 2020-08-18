package TestBooking.TestBooking;

import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;

import static org.hamcrest.Matchers.*;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class AppTest {

	@Test
	public void validarNumeroPaginas() {
		given().contentType(ContentType.JSON).param("page", "3").when().get("https://randomuser.me/api/").then()
				.assertThat().body("info.page", is(3));
		;
	}

	@Test
	public void validar20Usuarios() {
		given().contentType(ContentType.JSON).param("results", 20).when().get("https://randomuser.me/api/").then()
				.assertThat().body("info.results", is(20));
		;
	}

	@Test
	public void umUsuariobr() {
		given().contentType(ContentType.JSON).param("nat", "br").when().get("https://randomuser.me/api/").then()
				.body("results[0].nat", is("BR"));
		;
	}

	@Test
	public void validarNacionalidades() {
		given().contentType(ContentType.JSON).
		param("nat", "br,us,ca,es").
		when().
		get("https://randomuser.me/api/")
		.then().log().body().
		assertThat().body("results[0].nat", anyOf(equalTo("BR"), equalTo("US"), equalTo("CA"), equalTo("ES")));
	}

	// Parte 2 dois dos testes//
	@Test
		public void listarReservas() {
			given().contentType(ContentType.JSON).
			when().
			get("https://restful-booker.herokuapp.com/booking").
			then().log().body().
			body("$ " , Matchers.notNullValue() )
			;}

	@Test
	public void criarUmaReserva() {
		String reserva = 
		
		
		
		
		given().contentType(ContentType.JSON).param("bookingid", "5").
		when().
		post("https://restful-booker.herokuapp.com/booking").
		then()
		statusCode(200).
		body("bookingid", is("5"));
		;
	}

	@Test
		public void deletarUmaReserva() {
		given().contentType(ContentType.JSON).
		param("", "").
		when().
		delete("https://restful-booker.herokuapp.com/booking").
		then().
		bookingid 5 = new bookingid
		assertThat().body("created" , is("created"));
		;	
		
						
	}

}
