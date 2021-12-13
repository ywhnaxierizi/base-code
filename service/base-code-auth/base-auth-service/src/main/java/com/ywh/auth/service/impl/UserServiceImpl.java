package com.ywh.auth.service.impl;

import com.ywh.auth.common.dao.UserMapper;
import com.ywh.auth.common.domain.User;
import com.ywh.auth.service.inteface.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl extends CommonServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    /***
     * 通过用户名获取用户信息
     * @param userName
     * @return
     */
    @Override
    public User findByUserName(String userName) {
        List<User> userList = userMapper.findByUserName(userName);
        if (CollectionUtils.isEmpty(userList)) {
            return null;
        }
        return userList.get(0);
    }

}
