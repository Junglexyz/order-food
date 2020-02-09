package com.jungle.order.admin.web;

import com.jungle.order.core.service.UserTokenManager;
import com.jungle.order.core.util.JacksonUtil;
import com.jungle.order.core.util.ResponseUtil;
import com.jungle.order.db.pojo.Admin;
import com.jungle.order.db.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 登录权限验证
 * @author: jungle
 * @create: 2020-02-04 14:31
 */
@RestController
@RequestMapping("/admin/auth")
public class AuthController {
    @Autowired
    private AdminService adminService;

   @PostMapping("/login")
   public Object login(@RequestBody String body){
       Long adminId = Long.valueOf(JacksonUtil.parseString(body, "adminId"));
       String password = JacksonUtil.parseString(body, "password");
       Admin admin = adminService.loginByPassword(adminId, password);
       Map<String, Object> result = new HashMap<>();
       result.put("admin", admin);
       result.put("token", UserTokenManager.generateToken(adminId));
       return ResponseUtil.ok(result);
   }
}
