package com.mall;

import com.mall.common.websocket.WebSockertFilter;
import com.mall.modules.sys.service.SystemService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching
@SpringBootApplication
@ServletComponentScan(basePackages = {"com.mall","cn.xxx"})
@ComponentScan(basePackages = {"com","com.mall","cn.xxx"})
@MapperScan(basePackages={"com.mall.modules.**.dao"})
@EnableScheduling
@EnableAutoConfiguration
@Configuration
public class MallApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
        SystemService.printKeyLoadMessage();
        //IM WebSocker
        WebSockertFilter w = new WebSockertFilter();
        w.startWebsocketChatServer();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //this.setRegisterErrorPageFilter(false); // 错误页面有容器来处理，而不是SpringBoot
        return builder.sources(MallApplication.class);
    }
}
