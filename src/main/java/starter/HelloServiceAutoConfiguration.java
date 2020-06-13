package starter;

import config.HelloServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import properties.HelloProperties;

/**
 * author: yuzq
 * create: 2020-06-12 15:54
 **/
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloServiceConfiguration.class)
@ConditionalOnProperty(prefix = "yuzq", value = "enabled", matchIfMissing = true)
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloServiceConfiguration.class)
    public HelloServiceConfiguration helloServiceConfiguration() {
        HelloServiceConfiguration helloService = new HelloServiceConfiguration();
        helloService.setName(helloServiceProperties.getName());
        helloService.setHobby(helloServiceProperties.getHobby());
        return helloService;
    }
}
