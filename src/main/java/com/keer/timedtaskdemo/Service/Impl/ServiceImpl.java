package com.keer.timedtaskdemo.Service.Impl;

import com.keer.timedtaskdemo.Service.IService;
import com.keer.timedtaskdemo.TimedTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: timedtaskdemo
 * @BelongsPackage: com.keer.timedtaskdemo.Service.Impl
 * @Author: keer
 * @CreateTime: 2019-07-24 23:00
 * @Description: 接口实现
 */
@Service
public class ServiceImpl implements IService {
    @Autowired
    TimedTask timedTask;

    /**
     * 执行一次后10秒后在执行一次
     */
    @Override
    public void timeRate() {
        timedTask.fixed();
    }

    /**
     * 执行一次后每10秒执行一次执行
     */
    @Override
    public void timeDelay() {
        timedTask.fixedDelay();
    }
}
