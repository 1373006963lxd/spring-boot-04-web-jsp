package com.atguigu.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*必须要有的实现SpringBootServletInitializer类*/
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        /*应用主程序*/
        return application.sources(SpringBoot04WebJspApplication.class);
    }

}
