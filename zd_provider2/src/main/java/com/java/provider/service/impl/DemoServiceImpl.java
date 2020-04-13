package com.java.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commons.DemoService;

/**
 * author:快乐风男
 * time:16:34
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String test01(String userName) throws Exception {
        System.out.println("此时这里走的是provider2!!!!");
        return userName;
    }
}
