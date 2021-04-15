package com.wuxin.service.impl;

import com.wuxin.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/14 20:09
 */
@Repository("service")
public class AccountServiceImpl implements IAccountService {
    //    @Qualifier("IAccountDao")
    @Autowired
    private IAccountDao asd;
//    @Override
    public void ss() {
        asd.say();
    }

    public void study() {
        System.out.println("这是study");
    }


}
