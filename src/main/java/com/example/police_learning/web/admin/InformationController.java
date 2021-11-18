package com.example.police_learning.web.admin;

import com.example.police_learning.po.Information;
import com.example.police_learning.service.InformationService;
import com.example.police_learning.utils.ReturnResult;
import com.example.police_learning.utils.ReturnResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class InformationController {
    Integer page = 1;
    Integer size = 5;
    public  static String  fileName;
    @Autowired
    private InformationService informationService;

    // 分页显示数据
    //前端可以选择性地展示相关内容
    @ResponseBody
    @GetMapping("/admin/info")
    public Page<Information> showPage(){
        return informationService.getPage(page, size);
    }
    // 排序分页显示数据
    @ResponseBody
    @GetMapping("/admin/info_sort")
    public Page<Information> showSortPage(){
        return informationService.getPageSort(page, size);
    }

    //图片上传
    @PostMapping("/admin/infomation_input/photo_input")
    public ReturnResult fileUpload(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request) {
        if (file.isEmpty()) {
            System.out.println("文件为空");
        }
        fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "E:\\police_learning\\src\\main\\java\\com\\example\\police_learning\\photos\\"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = "/temp-rainy/" + fileName;

        model.addAttribute("filename", filename);
        return ReturnResultUtils.returnSuccess();
    }

    //将title、content、picture、top保存到数据库中
    @ResponseBody
    @PostMapping("admin/information_input")
    public ReturnResult saveInformation(@Validated Information information){
        Information info = informationService.saveInformation(information);
        if(info != null){
            return ReturnResultUtils.returnSuccess();
        }
        else {
            return ReturnResultUtils.returnFail(401,"保存失败");
        }
    }

    @ResponseBody
    @PostMapping("admin/information/comment")
    public ReturnResult seeComment(){
        return ReturnResultUtils.returnSuccess();
    }
}
