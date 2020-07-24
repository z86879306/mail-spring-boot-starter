package fun.hily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version V1.0
 * @description: TODO
 * @author: 宏伟数科-陈立宇
 * @date: 2020/7/24
 * @Copyright 该项目由宏伟数科版权所有，未经过允许的情况下，私自分享视频和源码属于违法行为。
 */
@EnableConfigurationProperties(CustomerProperties.class)
@Configuration
public class CustomerAutoConfiguration {

    @Autowired
    private CustomerProperties customerProperties;

    @Bean
    public CustomerService customerService(){
        return new CustomerService(customerProperties.getName());
    }
}
