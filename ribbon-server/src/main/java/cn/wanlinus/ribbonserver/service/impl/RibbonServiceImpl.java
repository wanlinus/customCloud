package cn.wanlinus.ribbonserver.service.impl;

import cn.wanlinus.ribbonserver.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wanli
 * @date 2018-07-31 18:00
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello() {
        return restTemplate.getForObject("http://CLOUD-SERVICE/hello", String.class);
    }

    public String helloError() {
        return "hello Error";
    }
}
