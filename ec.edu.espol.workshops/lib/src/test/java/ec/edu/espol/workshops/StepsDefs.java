package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static org.junit.Assert.*;

public class StepsDefs{
	private int actualAnswer;
	public CarInsurance carinsurance = new CarInsurance();
		
	//Second Test Scenario
	@Given("the customer is a {int} year old")
	public void the_customer_is_x_year_old(Integer age) {
		carinsurance.setCustomerAge(age);
	}
	
	@And("the customer is {string}")
	public void the_customer_is_x(String maritalStatus) {
		if(maritalStatus.equals("married")) {
			carinsurance.setMarriedStatus(true);
		}
		else{
			carinsurance.setMarriedStatus(false);
		}
	}
	
	@And("the customer is a {string}")
	public void the_customer_is_a_x(String sex) {
		if(sex.equals("man")) {
			carinsurance.setCustomerSex('M');
		}
		else{
			carinsurance.setCustomerSex('F');
		}
	}
	
	
	@And("the customer has a {string}")
	public void the_customer_has_a_x(String haveLicense) {
		if(haveLicense.equals("license")) {
			carinsurance.setHaveLicense(true);
		}
		else{
			carinsurance.setHaveLicense(false);
		}
	}
	
	@When("calculate the premium")
	public void calculate_the_premium() {
		actualAnswer = carinsurance.calculateInsurance();
	}
	
	@Then("show {int}")
	public void show_premium(Integer premium) {
		assertEquals((int) premium, actualAnswer);
	}

	
}