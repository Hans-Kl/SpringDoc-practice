package com.springdoc.practice.cycle;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 测试循环依赖
 * 2019/9/23 15:11
 *
 * @author klh
 * @version 1.0
 */
@Component
@NoArgsConstructor
public class Egg {

    private String color;

    @Autowired
    private Chick chick;

}
