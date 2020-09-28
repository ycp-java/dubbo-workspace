/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: StuserviceImpl
 * Author:   ycp
 * Date:     2020/9/26 11:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service.impl;

import com.ytc.mapper.StudentMapper;
import com.ytc.model.Student;
import com.ytc.service.Stuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ycp
 * @create 2020/9/26
 * @since 1.0.0
 */
@Service
public class StuserviceImpl implements Stuservice {
@Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectstu() {
        return studentMapper.selectstu();
    }
}