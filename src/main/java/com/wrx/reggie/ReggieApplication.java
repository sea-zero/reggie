package com.wrx.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author wrx
 * @date 2022/08/04/3:52
 */
@Slf4j
@SpringBootApplication
public class ReggieApplication {
    public static void main(String[] args) {

        SpringApplication.run(ReggieApplication.class, args);
        log.info("项目启动成功……");
    }

}
