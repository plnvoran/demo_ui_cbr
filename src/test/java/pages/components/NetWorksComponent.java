package pages.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverConditions.url;
import static data.NetWorksUrls.*;

public class NetWorksComponent {

    SelenideElement networksItemVk = $(".header_networks ._vk");
    SelenideElement networksItemYouTube = $(".header_networks ._yt");
    SelenideElement networksItemTelegram = $(".header_networks ._tg");
    SelenideElement networksItemYandex = $(".header_networks ._ydzen");
    SelenideElement networksItemOk = $(".header_networks ._ok");
    SelenideElement cookieAcceptAllButton = $(".VtwTSb button[aria-label='Accept all']");

    private final String isRemote;

    public NetWorksComponent(String isRemote) {
        this.isRemote = isRemote;
    }

    public void checkAllNetWorksItemIsVisible() {
        networksItemVk.shouldBe(visible);
        networksItemYouTube.shouldBe(visible);
        networksItemTelegram.shouldBe(visible);
        networksItemYandex.shouldBe(visible);
        networksItemOk.shouldBe(visible);
    }

    public void checkVkUrlIsRight() {
        networksItemVk.shouldBe(visible).click();
        Selenide.webdriver().shouldHave(url(networkUrlVk));
    }

    public void checkYandexUrlIsRight() {
        networksItemYandex.shouldBe(visible).click();
        Selenide.webdriver().shouldHave(url(networkUrlYandex));
    }

    public void checkOKUrlIsRight() {
        networksItemOk.shouldBe(visible).click();
        Selenide.webdriver().shouldHave(url(networkUrlOk));
    }

    public void checkTelegramUrlIsRight() {
        networksItemTelegram.shouldBe(visible).click();
        Selenide.webdriver().shouldHave(url(networkUrlTelegram));
    }

    public void clickYoutubeUrlIsRight() {
        networksItemYouTube.shouldBe(visible).click();
        if (isRemote.equals("remote")) {
            cookieAcceptAllButton.should(visible).click();
        }
        Selenide.webdriver().shouldHave(url(networkUrlYoutube));
    }
}
