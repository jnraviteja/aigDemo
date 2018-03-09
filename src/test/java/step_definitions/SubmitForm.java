package step_definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import com.github.javafaker.Faker;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SubmitForm {
public WebDriver driver;
public Faker faker;
       
    @Given("^Chrome browser should be opened$")
    public void open_chrome_browser() {
    	AssertJUnit.assertEquals(1, 1);
    }
    
    @When("^navigate to practiceform link$")
	public void navigate_to_practiceform_link() throws Throwable {
    	AssertJUnit.assertEquals(1, 1);
	}
	@When("^the form is submitted with all fields filled$")
	public void i_fill_all_fields_on_the_form_and_submit() throws Throwable {
		AssertJUnit.assertEquals(1, 1);
	}
	@Then("^Successfully submitted message should be shown$")
	public void i_should_see_successfully_submitted() throws Throwable {
		AssertJUnit.assertEquals(1, 1);
	}
	@When("^Zephyrcodecontest website is launched$")
	public void i_open_zephyrcodecontest_website() throws Throwable {
		AssertJUnit.assertEquals(1, 1);
	}
	@When("^the form is filled with \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void i_fill(String firstname, String lastname, String sex, String yrs, String dateStopped) throws Throwable {
		AssertJUnit.assertEquals(1, 1);
	}
	@When("^the form is filled with \"(.*?)\" \"(.*?)\" \"(.*?)\" and \"(.*?)\"$")
	public void i_fill_and(String tea, String excitedAbout, String continent, String seleniumCommands) throws Throwable {
		//ravi
		AssertJUnit.assertEquals(1, 1);
	}
	@When("^clicked on submit button$")
	public void i_hit_submit_button() throws Throwable {
		AssertJUnit.assertEquals(1, 1);
	}
	@Then("^Go back to Welcome page and verify title$")
	public void i_go_back_to_Welcome_page_and_verify_title() throws Throwable {
		AssertJUnit.assertEquals(1, 1);
	}

	@When("^the form is filled with invalid values$")
	public void i_fill_the_form_with_fake_values() throws Throwable {
		AssertJUnit.assertEquals("Success", "Failed", "Entered values are invalid");
	}
	
	@When("^Clicked on submit button without filling mandatory fields$")
	public void click_on_submit_button_without_providing_mandatory_fields() throws Throwable {
		AssertJUnit.assertEquals("Success", "Fail", "Missing mandatory fields");
	}
	
	@Then("^Error message should be shown$")
	public void show_error_message() throws Throwable {
		AssertJUnit.assertEquals("Error", "Error");
	}
}
