package pages.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverConditions.url;
import static data.NetWorksUrls.*;

public class NetWorksComponent {

    SelenideElement networksItemVk = $(".header_networks ._vk"),
            networksItemYouTube = $(".header_networks ._yt"),
            networksItemTelegram = $(".header_networks ._tg"),
            networksItemYandex = $(".header_networks ._ydzen"),
            networksItemOk = $(".header_networks ._ok");

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

    public void checkYoutubeUrlIsRight() {
        networksItemYouTube.shouldBe(visible).click();
        Selenide.webdriver().shouldHave(url(networkUrlYoutube));
    }
}
