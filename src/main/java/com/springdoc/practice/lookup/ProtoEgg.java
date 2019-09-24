package com.springdoc.practice.lookup;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 多例的鸡蛋
 * 2019/9/23 16:36
 *
 * @author klh
 * @version 1.0
 */
@Component
@Scope("prototype")
@NoArgsConstructor
public class ProtoEgg {

}
