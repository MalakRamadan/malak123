package software_test;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import software_hom.checkout;

public class CheckOutstep {
	private int price =0;
	private checkout check;
	@Given("the price of a {string} is {int}")
	
	public void the_price_of_a_is(String item,Integer price) {
	int i ;
		int intArray[];   
		
		intArray = new int[1000];
		for(i=0; i <1000;) {
			
			intArray[i]=price;
			
		}
		i++;	
		}
	
@When("I checkout {int} {string}")


public void iCheckout(Integer itemCount , String string) {
	check=new checkout();
	check.add(itemCount,price);
	
}



@Then("the total price should be {int}")
public void the_total_price_should_be(Integer price) {
	assertEquals(price.intValue(),check.total());
	
	
}
}
