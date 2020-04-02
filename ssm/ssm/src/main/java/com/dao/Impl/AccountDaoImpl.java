package com.dao.Impl;

import com.dao.IAccountDao;
import com.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Autowired
    private IAccountDao IAccountDao ;

    @Override
    public Account QueryUser(int id) {
        return(Account) IAccountDao.QueryUser(id) ;
    }
}
