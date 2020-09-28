/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: testcontroller
 * Author:   ycp
 * Date:     2020/9/26 10:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ycp
 * @create 2020/9/26
 * @since 1.0.0
 */
@Controller
public class testcontroller {

@RequestMapping("hello")
    public String hello(){
    return "hello";
}
}