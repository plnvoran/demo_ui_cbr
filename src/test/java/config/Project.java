package config;

import org.aeonbits.owner.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Project {

    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    private static final Logger logger = LoggerFactory.getLogger(Project.class);

    static {
        validateEnvDependentProperties();
        logger.info(config.toString());
    }

    private static void validateEnvDependentProperties() {
        validateProperty(config.platform(), "platform");
        switch (config.platform()) {
            case "local":
                validateProperty(Arrays.toString(config.browserAndVersion()), "browserWithVersion");
                break;
            case "remote":
                validateProperty(config.remoteDriverUrl(), "remoteDriverUrl");
                validateProperty(config.userNameSelenoid(), "userNameSelenoid");
                validateProperty(config.passwordSelenoid(), "passwordSelenoid");
                break;
            default:
                throw new IllegalStateException("Неправильное значение в 'platform' " + config);
        }
    }

    public static boolean isRemoteDriver() {
        return !(config.remoteDriverUrl() == null) && !config.remoteDriverUrl().isEmpty();
    }

    public static void validateProperty(String propertyValue, String propertyName) {
        assertThat(propertyValue)
                .withFailMessage("'%s' значение равно null или пусто!", propertyName)
                .isNotEmpty();
    }
}
