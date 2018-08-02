package cn.wanlinus.ribbonserver.controller;

import cn.wanlinus.ribbonserver.service.RibbonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanli
 * @date 2018-07-31 17:54
 */
@RestController
public class RibbonController {
    private static Logger logger = LoggerFactory.getLogger(RibbonController.class);


    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hello")
    public String hello() {
        return ribbonService.hello();
    }
}
