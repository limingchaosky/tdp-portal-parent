package com.goldencis.tdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by limingchao on 2018/9/14.
 */
@SpringBootApplication
@MapperScan(value = "com.goldencis.tdp.*.mapper")
public class TdpApplication {
    public static void main(String[] args) {

        SpringApplication.run(TdpApplication.class, args);
    }
}
