package net.ruixinglong.eatwhat.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "qiniu")
public class QiniuBean {
    private String accessKey;
    private String secretKey;
    private String bucket;
}
