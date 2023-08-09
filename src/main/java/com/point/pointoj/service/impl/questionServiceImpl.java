package com.point.pointoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.point.pointoj.model.entity.Question;
import com.point.pointoj.service.questionService;
import com.point.pointoj.mapper.questionMapper;
import org.springframework.stereotype.Service;

/**
* @author point
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2023-08-09 20:52:32
*/
@Service
public class questionServiceImpl extends ServiceImpl<questionMapper, Question>
    implements questionService{

}




