package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestBase;


import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;


public class MainPage extends TestBase{

    @FindAll({@FindBy(xpath = "//div[@id='nav']//li")})
    private List<WebElement> leftMenuItems;

    public List<WebElement> getLeftMenuItems() {
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOfAllElements(leftMenuItems));
        return leftMenuItems;
    }

    public void checkLeftCol(List<String> list_items){
        List<String> leftMenuItemstext =  new ArrayList<String>(); //массив с ссылками из левого меню
        for (WebElement elem : leftMenuItems){
            String text_elem = elem.getText();
            leftMenuItemstext.add(text_elem);
        }
        assertTrue(leftMenuItemstext.containsAll(list_items));
    }
}
