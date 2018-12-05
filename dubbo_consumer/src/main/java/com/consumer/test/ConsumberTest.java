package com.consumer.test;

import com.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumberTest {
    public static void main(String[] args){
        //得到springMvc配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
        context.start();
        //根据bean得到接口
        DemoService demoService=(DemoService)context.getBean("demoService");
        System.out.println(demoService.sayHello("jeffhardy"));
        try{
            System.in.read();//按任意键退出
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
