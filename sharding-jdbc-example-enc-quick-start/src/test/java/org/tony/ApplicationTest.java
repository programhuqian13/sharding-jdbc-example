package org.tony;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tony.domain.UserInfo;
import org.tony.service.UserInfoService;

import javax.annotation.Resource;

/**
 * @author Tony
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class ApplicationTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void testInsert(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAddress("ddd");
        userInfo.setEmail("1358158760@qq.cn");
        userInfo.setPassword("11111");
        userInfo.setUsername("dddd");
        userInfo.setTel("123123123");
        userInfo.setAddress("aaaaaa");
        userInfoService.save(userInfo);
    }

    @Test
    public void testFind(){
        UserInfo userInfo = userInfoService.getOne(new QueryWrapper<UserInfo>().lambda().eq(UserInfo::getPassword,"11111"));
        System.out.println(userInfo);
    }

}
