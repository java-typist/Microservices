package com.jason;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jason.common.utils.DataUtil;
import com.jason.user.UserServiceAPP;
import com.jason.user.dao.ManageMapper;
import com.jason.user.dao.RoleMapper;
import com.jason.user.dao.UserMapper;
import com.jason.user.model.Manage;
import com.jason.user.model.Role;
import com.jason.user.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        QueryWrapper<Manage> queryWrapper = new QueryWrapper<>();
        queryWrapper.groupBy("id");
        List<Manage> manage = manageMapper.selectList(queryWrapper);
        Set<Manage> manages = new HashSet<>();
        manages.addAll(manage);
        Role role = roleMapper.selectById(2);
        role.setManages(manages);
//        Set<Integer> ids = new HashSet<>();
//        for (Manage manage1 : role.getManages()) {
//            ids.add(manage1.getId());
//        }
//        roleMapper.relation(role.getId(), ids);
    }
}
