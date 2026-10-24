package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ContactUsPage;

public class ContactUsTest extends BaseTest {

    @Test
    public void customerCareContactFormSubmission() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.openContactUsPage();
        contactUsPage.fillContactForm(
                "Hakan",
                "hakan@example.com",
                "55533332211",
                "Contact form automation test");
        contactUsPage.submitContactForm();

        String actualConfirmation = contactUsPage.getConfirmationMessage();
        Assert.assertTrue(
                actualConfirmation.contains("Thanks Hakan"),
                "Contact form confirmation should include 'Thanks Hakan'. Actual message: "
                        + actualConfirmation);
    }
}
