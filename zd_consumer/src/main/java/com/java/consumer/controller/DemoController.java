package com.java.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.commons.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:快乐风男
 * time:16:10
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    //依赖公共的业务层接口对象，version = "1.0.0"提供者中业务层实现类的版本号
    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/loadTest01/{userName}")
    public @ResponseBody String loadTest01 (@PathVariable("userName") String userName){
        try {
            return demoService.test01(userName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
