package com.wuxin.dao.impl;

import com.wuxin.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author Tanoty
 * @version 1.0
 * @date 2021/3/13 15:04
 */
//@Service
/*@Controller  一般不归spring框架管理*/
//@Component
@Repository
public class AccountDaoImpl implements IAccountDao {

    public void say() {
        System.out.println("1904");
    }
}