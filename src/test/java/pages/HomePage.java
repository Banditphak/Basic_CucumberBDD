package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    private static HomePage page;
    public HomePage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }




    public static HomePage getPage(){
        if (page == null)
            page = new HomePage();
        return page;
    }

}


