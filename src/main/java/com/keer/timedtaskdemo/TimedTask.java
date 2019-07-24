package com.keer.timedtaskdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: timedtaskdemo
 * @BelongsPackage: com.keer.timedtaskdemo
 * @Author: keer
 * @CreateTime: 2019-07-24 22:31
 * @Description: 设置定时任务
 */
@Component
public class TimedTask {
    protected static final Logger logger = LoggerFactory.getLogger(TimedTask.class);


    /**
     * 每天三点执行
     */
    @Scheduled(cron="0 0 3 * * ? ")
    public void scheduled(){
        logger.info("这个是定时任务，每天3点执行");
    }

    /**
     * 上一次执行完后，10秒在执行一次
     */
    @Scheduled(fixedRate = 1000*10)
    public void fixed(){
        logger.info("10s 后在执行一次");
    }

    /**
     * 上一次执行完，每10秒执行一次
     */
    @Scheduled(fixedDelay = 1000*10)
    public void fixedDelay(){
        logger.info("每10s，执行一次");
    }
}
