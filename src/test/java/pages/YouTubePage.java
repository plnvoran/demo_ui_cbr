package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.NetWorksComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YouTubePage {

    SelenideElement cookieAcceptAllButton = $(".VtwTSb button[aria-label='Accept all']");

    public YouTubePage  cookiePressAcceptAll() {
        cookieAcceptAllButton.should(visible).click();
        return this;
    }

}