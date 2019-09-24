package com.springdoc.practice.lookup;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 包含多例的单例正确示范
 * 2019/9/23 16:32
 *
 * @author klh
 * @version 1.0
 */
@Component()
@Scope("singleton")
public class SingleChickenReal implements ApplicationContextAware {

    private ProtoEgg protoEgg;

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public ProtoEgg getProtoEgg() {
        this.protoEgg = (ProtoEgg) context.getBean("protoEgg");
        return protoEgg;
    }

}
