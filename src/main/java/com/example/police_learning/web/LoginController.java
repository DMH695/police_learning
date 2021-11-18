package com.example.police_learning.web;

import com.example.police_learning.po.User;
import com.example.police_learning.service.UserService;
import com.example.police_learning.utils.ReturnResult;
import com.example.police_learning.utils.ReturnResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @PostMapping("/login")
    public ReturnResult login(@RequestParam String account, @RequestParam String password, HttpSession session, RedirectAttributes attributes){
            User user = userService.checkUser(account,password);
            if(user != null){
                user.setPassword(null);
                session.setAttribute("user",user);
                List<Object> list = new ArrayList<>();
                Map<String,Object> result = new HashMap<>();
                result.put("account",01);
                list.add(result);
                return ReturnResultUtils.returnSuccess(list);
            }else {
                attributes.addFlashAttribute("message", "账号或密码错误");
                return ReturnResultUtils.returnFail(401,"账号或密码错误");

            }
    }
}
