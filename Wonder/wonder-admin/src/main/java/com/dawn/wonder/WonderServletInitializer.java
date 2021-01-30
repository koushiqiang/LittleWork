package com.dawn.wonder;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Description:
 * @Date: 2021-1-30 , 0030 17:35
 * @Author: kousq
 * @Version：1.0
 */
public class WonderServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WonderApplication.class);
    }
}

