package com.java.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commons.DemoService;

/**
 * author:快乐风男
 * time:16:25
 */
@Service(version = "1.0.0") //dubbo容器的实例化注解 version = "1.0.0"此业务层对象的版本号
public class DemoServiceImpl implements DemoService {
    @Override
    public String test01(String userName) throws Exception {
        System.out.println("此时这里走的是provider1......");
        return userName;
    }
}
