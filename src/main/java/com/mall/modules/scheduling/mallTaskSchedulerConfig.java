package com.mall.modules.scheduling;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.mall.modules.scheduling")
@EnableScheduling
public class mallTaskSchedulerConfig {

}