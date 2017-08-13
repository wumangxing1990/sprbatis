package com.test.service.impl;

/**
 * Created by Thinkpad on 2017/8/13.
 */

import com.test.dao.UserMapper;
import com.test.pojo.User;
import com.test.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}
