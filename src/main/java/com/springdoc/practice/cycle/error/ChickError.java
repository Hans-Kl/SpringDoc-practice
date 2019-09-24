package com.springdoc.practice.cycle.error;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 测试循环依赖
 * 2019/9/23 15:11
 *
 * @author klh
 * @version 1.0
 */
@Component
@AllArgsConstructor
public class ChickError {

    private EggError eggError ;

}
