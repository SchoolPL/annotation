import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import java.io.Serializable;
import java.lang.annotation.Native;
import java.rmi.Remote;
import java.util.EventListener;
import java.util.RandomAccess;

/**
 * @version v1.0
 */

@RepeatableCompany
@RepeatableCompany(name = "Name_2", city = "City_2")
@RepeatableCompany(name = "Name_2")
@MyMarker
public class Parent implements Cloneable, Serializable, EventListener, Remote, RandomAccess {

    @Native
    public static final String planet = "Earth";

    @FindBy
    String personName;

    @FindBy(id = "12", name = "33")
    String idPerson;

    /**
     * @param str входная строка
     * @return возвращет изменённую строку
     * @deprecated метод устарел. Используйте другой метод.
     */
    @Deprecated // Метод устарел и его лучше больше не использовать для работы
    public String someMethod(String str) {
        return str;
    }

    @Step("step 1")
    String someTest(@NotNull String list) {
        return list;
    }
}
