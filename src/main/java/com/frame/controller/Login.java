package com.frame.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frame.service.IUserService;
/**
 * 
 * @author gang.liu
 *
 */
@Controller
public class Login {

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value ="/login",method = RequestMethod.POST)
    public String login(HttpServletRequest req, HttpServletResponse resp){
        String username=req.getParameter("username");
        String pwd=req.getParameter("password");
        if(userService.verify(username,pwd)){
            req.getSession().setAttribute("user",userService.getUserByName(username));
            return "success";
        }
        else {
        	return "index";
        }

    }
}