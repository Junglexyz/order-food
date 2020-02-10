package com.jungle.order.db.service;

import com.jungle.order.db.dao.AdminMapper;
import com.jungle.order.db.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description: 登录权限
 * @author: jungle
 * @create: 2020-02-04 14:41
 */
@Service
public class AdminService {
    @Resource
    private AdminMapper adminMapper;

    public Admin loginByPassword(Long adminId, String password){
        return adminMapper.selectByPassword(adminId, password);
    }
}
