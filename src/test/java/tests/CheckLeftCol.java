package tests;

import org.junit.Test;
import pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class CheckLeftCol extends MainPage{


    ArrayList<String> list = new ArrayList<String>() {{  //ссылки по названиям которых проверяем
        add("Денежно-кредитная политика");
        add("Банк России сегодня");
        add("Финансовые рынки");
    }};
    @Test
    public void testLeftCol() {
        driver.navigate().to("http://www.cbr.ru/");
        checkLeftCol(list);
    }
}
