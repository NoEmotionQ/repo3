package com.service.Impl;

import com.dao.IAccountDao;
import com.pojo.Account;
import com.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
@Autowired
    private IAccountDao accountDao ;
    @Override
    public Account QueryUser(int id) {
        return accountDao.QueryUser(id) ;
    }
}
