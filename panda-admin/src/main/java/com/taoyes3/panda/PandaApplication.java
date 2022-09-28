package com.taoyes3.panda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author panda
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PandaApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(PandaApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  熊猫哒咔启动成功   ლ(´ڡ`ლ)ﾞ ");
    }
}
