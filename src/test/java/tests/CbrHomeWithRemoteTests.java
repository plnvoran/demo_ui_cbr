package tests;

import pages.CbrHomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("remote")

public class CbrHomeWithRemoteTests extends TestBase {


    CbrHomePage  cbrHomePage  = new  CbrHomePage ();
    @Test
    @Tag("smoke")
    @Tag("blocker")
    @DisplayName("Check main elements on RU Home")
    void checkMainElementsOnHomeRu() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });
        step("Check main elements on Home", () -> {
            cbrHomePage
                    .checkTopHorizontalMenuIsVisible()
                    .checkHeaderLeftMenuIsVisible()
                    .checkHeaderLogoIsVisible("RU")
                    .checkActiveSlideIsVisible();
        });
    }

    @Test
    @Tag("smoke")
    @Tag("blocker")
    @DisplayName("Check that default language is RU")
    void checkDefaultLanguage() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });
        step("Check main elements on home page", () -> {
            cbrHomePage.checkActiveLanguage("RU");
        });
        step("Check RU Home title", () -> {
            cbrHomePage.checkHomeTitle("RU");

        });
    }

    @Test
    @Tag("smoke")
    @Tag("blocker")
    @DisplayName("Check available languages")
    void checkAvailableLanguages() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });
        step("Check available languages", () -> {
            cbrHomePage.checkNoActiveLanguage("EN");
            cbrHomePage.checkActiveLanguage("RU");
        });
    }

    @Test
    @Tag("smoke")
    @Tag("blocker")
    @DisplayName("Check swithing to English")
    void switchToEnglish() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });
        step("Switch to English", () -> {
            cbrHomePage.switchToLanguage("EN");
        });
        step("Check EN Home title", () -> {
            cbrHomePage.checkHomeTitle("EN");
        });
    }

    @Test
    @Tag("smoke")
    @Tag("blocker")
    @DisplayName("Check main elements on EN Home")
    void checkMainElementsOnHomeEn() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });

        step("Switch to English", () -> {
            cbrHomePage.switchToLanguage("EN");
        });

        step("Check main elements on Home", () -> {
            cbrHomePage
                    .checkTopHorizontalMenuIsVisible()
                    .checkHeaderLeftMenuIsVisible()
                    .checkHeaderLogoIsVisible("EN")
                    .checkActiveSlideIsVisible();
        });
    }
}








