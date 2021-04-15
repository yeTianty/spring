package com.wuxin.dao.demo;

import com.wuxin.service.impl.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/13 15:04
 */


public class Test01 {
    public static void main(String[] args) {

        String config = "bean.xml";
        //创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示spring容器，通过容器获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        IAccountService a = ac.getBean("service", IAccountService.class);
        a.study();
        a.ss();


    }

}