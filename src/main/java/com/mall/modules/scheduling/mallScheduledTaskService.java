package com.mall.modules.scheduling;

import com.mall.common.utils.SendMailUtil;
//import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//import javax.jms.Destination;
import java.text.SimpleDateFormat;
import java.util.Date;

//@Service("mallScheduledTaskService")
@Component
public class mallScheduledTaskService {

    //@Autowired
    //private XXXService xxxxService;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //@Autowired
    //private mallProducer mallProducer;

    //每个10s执行一次任务
    @Scheduled(fixedRate = 600000)
    public void run(){
        //xxxxService.method();
        //System.out.println(dateFormat.format(new Date()) + " | " + "com.mall.modules.scheduling:每隔60s执行一次任务");
    }
    //每个2s执行一次任务#朝九晚七工作时间内每五分钟
    @Scheduled(cron = "0 0/10 9-19 * * ?")
    public void run2(){
        //System.out.println(dateFormat.format(new Date()) + " | " + "com.mall.modules.scheduling:朝九晚七工作时间内每十分钟执行一次任务");
        //mallProducer.sendMessageA( "ActiveMQ mallProducer queueA。");
        //mallProducer.sendMessageB("ActiveMQ mallProducer queueB。");
    }

    //每天15点29分执行该任务
    @Scheduled(cron = "0 29 15 ? * *")
    public void run3()
    {
        //System.out.println(dateFormat.format(new Date()) + " | " + "com.mall.modules.scheduling:每天在指定时间执行任务");
    }
}