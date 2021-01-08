package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.ProjectPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 1/7/2021
 */
public class ProjectTest extends BaseTest {
    ProjectPage projectPage;

    public ProjectTest() {
        projectPage = new ProjectPage(getDriver());
    }

    @Then("user clicks on {string} link")
    public void userClicksOnLink(String link) {
        if (!link.isEmpty() || null != link) {
            String linkTemp = link.toLowerCase();
            switch (linkTemp) {
                case "phone silencer": {
                    projectPage.getPhoneSilencerLink();
                    break;
                }
                case "back to project": {
                    projectPage.getbackToProjectLink();
                    break;
                }
                case "ghost blaster": {
                    projectPage.getghostblasterButton();
                    break;
                }
                case "mini soccer": {
                    projectPage.getMiniSoccerButton();
                    break;
                }
                default: {
                    Assert.fail("Button cannot be found");
                    break;
                }
            }
        } else {
            Assert.fail(link + "should not be empty or null");
        }
    }


    @Then("user sees the heading {string}")
    public void userSeesTheHeading(String heading) {
        switch (heading) {
            case "phone silencer": {
                String actualText = projectPage.getPhoneSilencerHeading();
                Assert.assertEquals("Actual Text does not match to Expected Text ", heading, actualText);
            }
            case "ghost blaster": {
                String actualText = projectPage.getGhostBlasterHeading();
                Assert.assertEquals("Actual Text does not match to Expected Text ", heading, actualText);

            }
            case "mini soccer": {
                String actualText = projectPage.getMiniSoccerHeading();
                Assert.assertEquals("Actual Text does not match to Expected Text ", heading, actualText);

            }
        }

    }
}
