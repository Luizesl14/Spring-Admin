package com.admin.io;

import com.admin.io.config.WebSecurityConfig;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({WebSecurityConfig.class})
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class IoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IoApplication.class, args);
    }

}
