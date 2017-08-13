/**
 * Created by Thinkpad on 2017/8/13.
 */

import com.test.pojo.User;
import com.test.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    @Resource
    private IUserService userService = null;


    @Test
    public void test1() {
        User user = userService.getUserById(1);
        System.out.println(user.getName());
        logger.info("值：" + user.getName());

    }
}