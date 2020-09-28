/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Stucontroller
 * Author:   ycp
 * Date:     2020/9/27 14:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.model.Student;
import com.ytc.service.Studentservice;
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
 * @create 2020/9/27
 * @since 1.0.0
 */
@Controller
@RequestMapping("/stu")
public class Stucontroller {

@Reference
    private Studentservice studentservice;

@RequestMapping("selectstu")

    public String selectstu(Model m){
    System.out.println(4444);
    List<Student> list=studentservice.selectstu();
    m.addAttribute("list",list);
    return "show";
}
}