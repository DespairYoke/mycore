package com.zwd;




import mytest.config.DataUtil;
import mytest.config.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest
{
    @Autowired
    private DataUtil dataUtil;
    @Test
    public void Test( )
    {
        dataUtil.say();
    }

}
