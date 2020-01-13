package com.keer.timedtaskdemo.TimedTask;

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
     * 每10秒执行一次
     */
    @Scheduled(cron="0/10 * * * * ? ")
    public void cron(){
        logger.info("cron任务，每10秒执行一次");
    }

    /**
     * 上一次执行完后，15秒在执行一次
     */
    @Scheduled(fixedRate = 1000*15)
    public void fixedRate(){
        logger.info("fixedRate任务，每15s后执行一次");
    }

    /**
     * 上一次执行完，5秒后在执行
     */
    @Scheduled(fixedDelay = 1000*5)
    public void fixedDelay(){
        logger.info("fixedDelay任务，任务执行后5秒执行");
    }
}
