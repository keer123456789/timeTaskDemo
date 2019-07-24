package com.keer.timedtaskdemo.Controller;

import com.keer.timedtaskdemo.Service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: timedtaskdemo
 * @BelongsPackage: com.keer.timedtaskdemo.Controller
 * @Author: keer
 * @CreateTime: 2019-07-24 22:51
 * @Description:
 */
@RestController
public class controller {
    protected static final Logger logger = LoggerFactory.getLogger(controller.class);

    @Autowired
    IService service;

    @GetMapping("/hello")
    public void hello(){
        logger.info("调用定时程序，执行一次后，10秒后在执行一次");
        service.timeRate();

    }

    @GetMapping("/world")
    public void world(){
        logger.info("调用定时程序，执行一次后，每10秒后在执行一次");
        service.timeDelay();
    }




}
