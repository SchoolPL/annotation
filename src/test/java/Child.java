import io.qameta.allure.Epic;
import io.qameta.allure.Story;

import java.util.HashMap;
import java.util.Map;

/**
 * @author "Alexey Romanov"
 * @see "������"
 */
@Epic("Epic")
@Story("Story")
@MyMarker
public class Child extends Parent {


//    @Override //������ ������ ��� � Parent
    public void someMethod() {

    }

    @Override // ����� ����� ���� � Parent
    public String someMethod(String str) {
        return str;
    }


    public void testSuppressWarning() {
        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "Item_1");
        testMap.put(2, "Item_2");
        testMap.put(3, "Item_3");
        System.out.println(testMap.get(1));
    }

    /**
     * ������������ ����������� ������
     *
     * @param str ������
     * @return ��������� ������
     */
    String deprecatedMethod(String str) {
        Parent parent = new Parent();
        return parent.someMethod(str);
    }
}
