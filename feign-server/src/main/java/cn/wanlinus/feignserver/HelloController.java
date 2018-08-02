package cn.wanlinus.feignserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanli
 * @date 2018-08-01 09:33
 */
@RestController
public class HelloController {

    @Autowired
    CommonFeignInterface commonFeignIn;

    @GetMapping(value = "/hello")
    public String hello() {
        return commonFeignIn.hello();
    }
}
