package com.walter.service;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(">>>>>>>>>>>>>>>>>");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("<<<<<<<<<<<<<<<<<");
        return bean;

        /*if(beanName.equals("studentService")) {
            Object beanProxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws
                        Throwable {
                            Object ret = null;
                            if (method.getName().equals("study")) {
                                System.out.println("==============");
                                ret = method.invoke(bean, args);
                                System.out.println("==============");
                            }
                            return ret;
                        }
                    });

            System.out.println("<<<<<<<<<<<<<<<<<");
            return beanProxy;
        }*/
    }
}
