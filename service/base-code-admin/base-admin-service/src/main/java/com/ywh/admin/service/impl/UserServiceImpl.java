package com.ywh.admin.service.impl;

import com.ywh.admin.common.dao.UserMapper;
import com.ywh.admin.common.domain.User;
import com.ywh.admin.service.face.UserService;
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


}
