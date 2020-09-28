/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: StudentserviceImpl
 * Author:   ycp
 * Date:     2020/9/27 14:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.mapper.StudentMapper;
import com.ytc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ycp
 * @create 2020/9/27
 * @since 1.0.0
 */
@Service
@Component
public class StudentserviceImpl implements Studentservice {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> selectstu() {
        return studentMapper.selectstu();
    }
}