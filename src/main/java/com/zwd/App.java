package com.zwd;

import mytest.config.DataUtil;
import mytest.config.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import(mytest.App.class)
public class App 
{

    public static void main( String[] args )
    {
      SpringApplication.run(App.class,args);
//      dataUtil.say();
    }
}
