/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Usercontroller
 * Author:   ycp
 * Date:     2020/9/26 11:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.model.Student;
import com.ytc.service.Stuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ycp
 * @create 2020/9/26
 * @since 1.0.0
 */
@Controller
public class Stucontroller {
    @Autowired
    private Stuservice stuservice;

    @RequestMapping("selectstu")
    public String selectstu(Model m){
       List<Student> list= stuservice.selectstu();
       m.addAttribute("list",list);
        return "show";
    }
    @RequestMapping("del")
    @ResponseBody
    public String del(){
        return "删除成功";
    }
}