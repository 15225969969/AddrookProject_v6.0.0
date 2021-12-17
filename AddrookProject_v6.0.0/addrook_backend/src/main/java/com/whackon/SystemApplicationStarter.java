package com.whackon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b>项目启动类</b>
 *
 * @author user
 * @date 2021/12/16
 * @version 6.0.0
 * @since 1.0.0
 */
@MapperScan("com.whackon..addrook.dao")
@SpringBootApplication
public class SystemApplicationStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemApplicationStarter.class, args);
	}
}
