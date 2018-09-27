package com.goldencis.tdp;

import com.sun.glass.ui.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by limingchao on 2018/9/14.
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "com.goldencis.tdp.*.mapper")
public class TdpApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TdpApplication.class, args);
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
*/
    @Override

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TdpApplication.class);
    }
}
