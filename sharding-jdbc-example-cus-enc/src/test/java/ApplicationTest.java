import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tony.Application;
import org.tony.domain.UserInfo;
import org.tony.service.UserInfoService;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author Tony
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class ApplicationTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void testInsertUser(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAddress("aaaaa");
        userInfo.setPassword("123456");
        userInfo.setUserName("amdin");
        userInfo.setSex("F");
        userInfo.setTelephone("12312312");
        userInfo.setLocalDateTime(LocalDateTime.now());
        userInfoService.save(userInfo);
    }

    @Test
    public void testFindUserById(){
        System.out.println(userInfoService.getById(1579395740506324993L));
    }

}
