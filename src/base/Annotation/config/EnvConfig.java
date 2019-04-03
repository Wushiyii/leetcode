package base.Annotation.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EnvConfig implements EnvironmentAware {

    private final Logger logger = Logger.getLogger("EnvConfig");

    private Environment environment;


    public String getStringValue(String key) {
        return environment.getProperty(key);
    }

    public Long getLongValue(String key) {
        String stringValue = getStringValue(key);
        try {
            return Long.parseLong(stringValue);
        }catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.SEVERE,"字符串转换失败 : {} = {}",new String[] {key,stringValue});
        }
        return 0L;
    }

    public int getIntValue(String key) {
        return getLongValue(key).intValue();
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
