package com.springdoc.practice.lookup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 2019/9/24 09:30
 *
 * @author klh
 * @version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SingleChickenTest {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private SingleChicken singleChicken;

    @Autowired
    private SingleChickenReal singleChickenReal;

    @Test
    public void testSingletonBeanHasPrototypeBean() {
        //从容器中多次取出同一个单例Bean，返回的是同一个对象
        assertEquals(context.getBean("singleChicken"),context.getBean("singleChicken"));

        //从同一个单例Bean中多次取出多例Bean，会每次取出都返回不同的新对象么？不会
        assertEquals(singleChicken.getProtoEgg(),singleChicken.getProtoEgg());

        //每次都从容器中取多例对象，才会如期返回
        assertNotEquals(singleChickenReal.getProtoEgg(),singleChickenReal.getProtoEgg());
    }
}