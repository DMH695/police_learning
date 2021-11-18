package com.example.police_learning.web;

import com.example.police_learning.po.Information;
import com.example.police_learning.service.InformationService;
import com.example.police_learning.utils.ReturnResult;
import com.example.police_learning.utils.ReturnResultUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class InfoController {
    Integer page = 1;
    Integer size = 500;
    @Autowired
    InformationService informationService;


    //资讯列表返回页面
    @ResponseBody
    @GetMapping("/information")
    public Page<Information> getInformation(){
        return informationService.getPage(page, size);
    }

    //向详情页中返回数据（title、creatTime、content、comment）


    //用户进行评论


    //用户进行收藏
    @ResponseBody
    @PostMapping("/information/collect")
    public ReturnResult collect(Boolean isCollect, Information information, HttpSession session){
        if(isCollect == true){
            //获取user对象，也可以从前端中获取
            User user = (User)session.getAttribute("user");
            //获取information对象

            return ReturnResultUtils.returnSuccess();
        }else {
            return ReturnResultUtils.returnFail(401,"收藏失败");
        }
    }
}
