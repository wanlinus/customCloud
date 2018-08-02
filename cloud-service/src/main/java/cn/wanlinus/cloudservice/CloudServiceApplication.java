package cn.wanlinus.cloudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，
 * 如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 *
 * @author wanli
 */

@SpringBootApplication
@EnableEurekaClient
public class CloudServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceApplication.class, args);
    }
}
