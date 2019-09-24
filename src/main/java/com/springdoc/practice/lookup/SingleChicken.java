package com.springdoc.practice.lookup;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 包含多例的单例错误示范
 * 2019/9/23 16:32
 *
 * @author klh
 * @version 1.0
 */
@Component()
@Scope("singleton")
@Getter
public class SingleChicken implements ApplicationContextAware {

    @Autowired
    private ProtoEgg protoEgg;

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }


}
