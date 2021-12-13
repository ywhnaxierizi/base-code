package com.ywh.auth.common.request;

import lombok.Data;

/**
 * @author ywh
 * @description
 * @Date 2021/12/10 15:08
 */
@Data
public class UserExportReq extends BaseReq {

    private Integer id;
    private String userName;
    private String nickName;
    private String email;
    private String mobilePhone;
    private String useState;
}
