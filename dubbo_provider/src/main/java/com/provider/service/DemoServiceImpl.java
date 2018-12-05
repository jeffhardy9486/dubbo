package com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.api.service.DemoService;


public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "hello !"+name;
    }
}
