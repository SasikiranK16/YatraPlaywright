package TechWithJatin.TechWithJatinPlaywright.testscripts;

import TechWithJatin.TechWithJatinPlaywright.pages.HomePage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class ToolshopTest extends TestBase {

    public void verifySignInButton() {
        HomePage homePage = new HomePage(getPage())
                .navigate();
        assertThat(homePage.isSignInButtonDisplayed()).isTrue();
    }

    public void verifySignInButton_failOnPurpose() {
        HomePage homePage = new HomePage(getPage())
                .navigate();
        assertThat(homePage.isSignInButtonDisplayed()).isFalse();
    }
}
