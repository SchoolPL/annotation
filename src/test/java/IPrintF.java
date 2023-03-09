import java.lang.annotation.*;

@FunctionalInterface
public interface IPrintF {
    void print();
}

@Target(ElementType.TYPE)
@Repeatable(RepeatableCompanies.class)
@Retention(RetentionPolicy.RUNTIME)
 @interface RepeatableCompany {
    String name() default "Name_1";
    String city() default "City_1";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface RepeatableCompanies {
    RepeatableCompany[] value() default{};
}

