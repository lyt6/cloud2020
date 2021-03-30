package com.hello.jsp.springboot.service.impl;

import com.hello.jsp.springboot.entity.User;
import com.hello.jsp.springboot.mapper.UserMapper;
import com.hello.jsp.springboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Liuyongtao
 * @since 2021-03-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
