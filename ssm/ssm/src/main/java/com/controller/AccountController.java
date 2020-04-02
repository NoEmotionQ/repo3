package com.controller;

import com.pojo.Account;
import com.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/AccountController")
@Controller
public class AccountController {
    @Autowired
    private IAccountService accountService ;
//    根据id查询用户信息
    @RequestMapping(path = "/QueryUser",params = {"id"})
    public ModelAndView QueryUser(int id)
    {
        ModelAndView mv = new ModelAndView() ;
        Account account = accountService.QueryUser(id) ;
        if (account!=null)
        {
            mv.addObject("Account",account) ;
            mv.setViewName("success");
        }
        else
        {
            mv.addObject("errorMessage","用户不存在！") ;
            mv.setViewName("error");
        }
        return  mv;
    }
}
