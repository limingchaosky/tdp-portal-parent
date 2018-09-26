package com.goldencis.tdp.core;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.concurrent.TimeUnit;

/**
 * Created by limingchao on 2018/9/26.
 */
public class PasswordEncoderTest {

    @Test
    public void passwordEncoderTest() throws InterruptedException {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = encoder.encode("456789");
        System.out.println(password);

        TimeUnit.SECONDS.sleep(2);

        String twice = encoder.encode("456789");
        System.out.println(twice);

        System.out.println(encoder.matches(password, twice));
        System.out.println(encoder.matches("456789", password));
    }

}
