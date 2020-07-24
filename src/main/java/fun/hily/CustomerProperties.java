package fun.hily;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @version V1.0
 * @description: TODO
 * @author: 宏伟数科-陈立宇
 * @date: 2020/7/24
 * @Copyright 该项目由宏伟数科版权所有，未经过允许的情况下，私自分享视频和源码属于违法行为。
 */
@ConfigurationProperties(prefix = "customer")
public class CustomerProperties {

    private static final String DEFAULT_NAME = "LY";

    private String name = DEFAULT_NAME;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
