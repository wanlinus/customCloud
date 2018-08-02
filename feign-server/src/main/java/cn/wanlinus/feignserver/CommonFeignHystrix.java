package cn.wanlinus.feignserver;

import org.springframework.stereotype.Component;

/**
 * @author wanli
 * @date 2018-08-01 09:43
 */
@Component
public class CommonFeignHystrix implements CommonFeignInterface {
    @Override
    public String hello() {
        return "Error Hystrix";
    }
}
