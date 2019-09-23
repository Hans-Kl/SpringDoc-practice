package com.springdoc.practice.lookup;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 包含多例的单例
 * 2019/9/23 16:32
 *
 * @author klh
 * @version 1.0
 */
@Component()
@Scope("singleton")
public class SingleChick implements ApplicationContextAware {

    private ProtoChickson protoChickson ;

    private ApplicationContext context;

    public ProtoChickson getProtoChickson() {
        this.protoChickson = (ProtoChickson)context.getBean("protoChickson");
        return protoChickson;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}
