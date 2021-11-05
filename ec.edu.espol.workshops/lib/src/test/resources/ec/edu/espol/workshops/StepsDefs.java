package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static org.junit.Assert.*;

public class StepsDefs{
	private int actualAnswer;
	public CarInsurance carinsurance = new CarInsurance();
	
	//First Test Scenario
	@Given("^the customer is 40 years old$")
	public void the_customer_is_40_years_old() {
		carinsurance.setCustomerAge(40);
	}
	
	@And("^the customer is married$")
	public void the_customer_is_married() {
		carinsurance.setMarriedStatus(true);
	}
	
	@And("^the customer is a man$")
	public void the_customer_is_a_man() {
		carinsurance.setCustomerSex('M');
	}
	
	@And("^the customer has a license$")
	public void the_customer_has_a_license() {
		carinsurance.setHaveLicense(true);
	}
	
	@When("^calculate the premium$")
	public void calculate_the_premium() {
		actualAnswer = carinsurance.calculateInsurance();
	}
	
	@Then("^show 300$")
	public void show_300() {
		assertEquals(actualAnswer,300);
	}

	
}