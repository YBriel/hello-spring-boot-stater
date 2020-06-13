package properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * author: yuzq
 * create: 2020-06-12 15:47
 **/
@ConfigurationProperties(prefix = "yuzq")
@EnableConfigurationProperties(HelloProperties.class)
public class HelloProperties {

        private String name;

        private String hobby;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHobby() {
            return hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

}
