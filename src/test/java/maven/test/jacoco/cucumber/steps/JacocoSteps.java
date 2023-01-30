package maven.test.jacoco.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import maven.test.jacoco.Jacoco;
import org.junit.Assert;

public class JacocoSteps {

    private int calculationResult;

    @When("^user calculates (\\d+) \"([^\"]*)\" (\\d+)$")
    public void user_calculate_int_string_int(int number1, String operation, int number2) {
        calculationResult = new Jacoco().minus(number1, number2);
    }

    @Then("user sees result is {int}")
    public void userSeesResultIs(int result) {
        Assert.assertEquals(result, calculationResult);
    }

    @And("user verifies {int} is {string}")
    public void userVerifiesIs(int number, String type) {
        if (type.equals("negative")) Assert.assertTrue(new Jacoco().isNegative(number));
        if (type.equals("positive")) Assert.assertFalse(new Jacoco().isNegative(number));
    }
}
