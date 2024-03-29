package com.jason;

import com.jason.user.UserServiceAPP;
import com.jason.user.dao.ManageMapper;
import com.jason.user.dao.RoleMapper;
import com.jason.user.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author Jason
 * @CreateTime 2019/8/19 14:43
 * @Modify 2019/8/19 14:43
 * @Version 1.0
 */
@SpringBootTest(classes = UserServiceAPP.class)
@RunWith(SpringRunner.class)
public class TestUser {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private ManageMapper manageMapper;

    @Test
//    @Transactional
    public void testPlus() {

    }
}
