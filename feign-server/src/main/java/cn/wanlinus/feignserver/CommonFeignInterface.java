package cn.wanlinus.feignserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 在FeignClient value属性里面填写服务名
 *
 * @author wanli
 * @date 2018-08-01 09:29
 */
@FeignClient(value = "CLOUD-SERVICE", fallback = CommonFeignHystrix.class)
public interface CommonFeignInterface {

    /**
     * Feign Hello World
     *
     * @return
     */
    @GetMapping("/hello")
    String hello();
}
