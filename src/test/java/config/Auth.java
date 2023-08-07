package config;

import static org.assertj.core.api.Assertions.assertThat;

public class Auth {

    public static void validateProperty(String propertyValue, String propertyName) {
        assertThat(propertyValue)
                .withFailMessage("'%s' значение равно null или пусто!", propertyName)
                .isNotEmpty();
    }
}
