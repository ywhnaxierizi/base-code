package com.ywh.auth.service.inteface;


import com.ywh.auth.common.domain.User;

public interface UserService extends CommonService<User> {
    /***
     * 通过用户名获取用户信息
     * @param userName
     * @return
     */
    User findByUserName(String userName);
}
