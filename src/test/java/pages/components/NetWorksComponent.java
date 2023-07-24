package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NetWorksComponent {

    SelenideElement networksItemVk = $(".header_networks ._vk"),
            networksItemYt = $(".header_networks ._yt"),
            networksItemTg = $(".header_networks ._tg"),
            networksItemY = $(".header_networks ._ydzen"),
            networksItemOk = $(".header_networks ._ok");

    public void checkAllNetWorksItemIsVisible() {
        networksItemVk.shouldHave(Condition.visible);
        networksItemYt.shouldHave(Condition.visible);
        networksItemTg.shouldHave(Condition.visible);
        networksItemY.shouldHave(Condition.visible);
        networksItemOk.shouldHave(Condition.visible);
    }

}
