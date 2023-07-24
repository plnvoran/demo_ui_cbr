package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("regress")
public class CbrHomeTests extends TestBase {

    @Test
    @Epic("Home")
    @Owner("d.litinskii")
    @Tag("smoke")
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
    @Epic("Home")
    @Owner("d.litinskii")
    @Tag("smoke")
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
    @Epic("Home")
    @Owner("d.litinskii")
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
    @Epic("Home")
    @Owner("d.litinskii")
    @DisplayName("Check switching to English")
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
    @Epic("Home")
    @Owner("d.litinskii")
    @DisplayName("Check switching to Russian")
    void switchToRussian() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });
        step("Switch to English", () -> {
            cbrHomePage.switchToLanguage("EN");
        });
        step("Switch to Russian", () -> {
            cbrHomePage.switchToLanguage("RU");
        });
        step("Check RU Home title", () -> {
            cbrHomePage.checkHomeTitle("RU");
        });
    }

    @Test
    @Epic("Home")
    @Owner("d.litinskii")
    @DisplayName("Check main elements on EN Home")
    void checkMainElementsOnHomeEn() {
        step("Open Home", () -> {
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

    @Test
    @Epic("Home")
    @Owner("d.litinskii")
    @DisplayName("Check that all networks links are on Home")
    void checkGoToYouTube() {
        step("Open home", () -> {
            cbrHomePage.openPage();
        });

        step("Check networks links are on Home", () -> {
            cbrHomePage.checkAllNetWorksItemIsVisible();
        });
    }
}








