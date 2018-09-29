package com.goldencis.tdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by limingchao on 2018/9/14.
 */
@SpringBootApplication
@EnableTransactionManagement()
public class TdpApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TdpApplication.class, args);
    }
    @Override

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TdpApplication.class);
    }
}
/*public class TdpApplication {
    public static void main(String[] args) {
        SpringApplication.run(TdpApplication.class, args);
    }
}*/
