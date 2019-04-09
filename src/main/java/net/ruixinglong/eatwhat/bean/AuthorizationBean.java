package net.ruixinglong.eatwhat.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
//@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "authorization")
public class AuthorizationBean {
    private String secret;
}
