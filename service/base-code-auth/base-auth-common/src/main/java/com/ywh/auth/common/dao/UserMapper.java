package com.ywh.auth.common.dao;

import com.ywh.auth.common.domain.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {

    List<User> findByUserName(String userName);

    int count();
}
