import org.junit.Test;
import org.openqa.selenium.By;

public class NewsConfirm {

    private Core core =  new Core();

    @Test
    public void newsConfirmation() {
        String text = "ФОТО. Скрытая жемчужина латвийской природы";
        String target = "//a[@class='top2012-title']";
        String url = "http://rus.delfi.lv/";

        core.openWebPage(url);
        core.assertList(By.xpath(target), text);
        core.closeWebPage();
    }
}
