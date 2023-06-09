package pages.resuls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shard.AbstractComponent;

public class NavigationBar extends AbstractComponent {
    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(linkText = "News")
    private WebElement news;


    public void goToImages(){
        this.images.click();
    }
    public void goToNews(){
        this.news.click();
    }

    public NavigationBar(final WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.bar.isDisplayed());
    }
}
