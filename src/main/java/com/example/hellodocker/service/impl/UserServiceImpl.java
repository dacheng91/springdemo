package com.example.hellodocker.service.impl;

import com.example.hellodocker.model.User;
import com.example.hellodocker.dao.UserDao;
import com.example.hellodocker.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chencheng
 * @since 2022-04-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
