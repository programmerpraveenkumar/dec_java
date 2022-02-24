package com.app.com.app.Configuration;


import com.app.com.app.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
public class SchedulerSample {
    @Autowired
    UserService user;

    private static final Logger log = LoggerFactory.getLogger(SchedulerSample.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 5000)//ever 5 sec
//    public void reportCurrentTime() {
//        //calling the service
//        log.info("The time is now {}", dateFormat.format(new Date()));
//    }

    //@Scheduled(cron = "*/30 * * * * *")//every 30 sec
    //@Scheduled(cron = "55 45 09 * * *")//every day 9:45:55
    //@Scheduled(cron = "0 0 24 * * *")//every day night 12'o
    public void sampleCronCurrentTime() {
        //calling the service
        user.getUserFromUserTable();
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
