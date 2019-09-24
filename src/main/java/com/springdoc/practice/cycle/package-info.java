/**
 * 2019/9/23 16:29
 * 测试循环依赖问题，鸡蛋和鸡
 * 两个Bean都通过构造函数注册注入，则会产生循环依赖错误
 * 通过属性注入则不会有问题
 * Spring的循环依赖的理论依据其实是基于Java的引用传递，当我们获取到对象的引用时，对象的field或zh属性是可以延后设置的(但是构造器必须是在获取引用之前)。
 * @author klh
 * @version 1.0
 */
package com.springdoc.practice.cycle;