package com.jungle.order.db;

import com.jungle.order.db.pojo.Admin;
import com.jungle.order.db.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: AdminService测试
 * @author: jungle
 * @create: 2020-02-05 13:37
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdminServiceTest {

    @Autowired
    AdminService adminService;

    @Test
    public void loginByPassword(){
        Admin result = adminService.loginByPassword(18789197915L,"qwer");
        System.out.println(result);
    }
}
