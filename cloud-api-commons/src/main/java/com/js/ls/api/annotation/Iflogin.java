package com.js.ls.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ：雷升
 * @date ：Created in 2020/5/10 18:01
 * @description：判断登入注解
 * @modified By：
 * @version: 1$
 */
@Target(ElementType.METHOD)//用于描述方法
@Retention(RetentionPolicy.RUNTIME)//注解保留到运行阶段
public @interface Iflogin {
}
