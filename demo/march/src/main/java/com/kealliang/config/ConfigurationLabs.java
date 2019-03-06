package com.kealliang.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lsr
 * @ClassName ConfigurationLabs
 * @Date 2019-02-19
 * @Desc 配置实验室
 * @Vertion 1.0
 */
@Configuration
public class ConfigurationLabs {

    @PostConstruct
    public void postMethod() {
        System.err.println("POST: PostMethod has been invoke");
    }

    /************************** bean的后处理器 **************************/
    @Bean
    public BeanPostProcessor beanPostProcessor() {
        return new PostProcessor();
    }

    public class PostProcessor implements BeanPostProcessor {
        private AtomicInteger i = new AtomicInteger();

        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            if (beanName.equalsIgnoreCase("testBean")) {
                System.err.println("后处理器-init方法前： " + beanName);
            }
            return bean;
        }

        @Override
        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            if (beanName.equalsIgnoreCase("testBean")) {
                System.err.println("后处理器-init方法后： " + beanName + " --> " + i.addAndGet(1));
            }
            return bean;
        }
    }

    /************************** bean的初始化方法 **************************/
    @Bean(initMethod = "initMethod")
    public TestBean testBean() {
        return new TestBean();
    }

    public class TestBean {
        public TestBean() {
            System.err.println("testBean's constructor");
        }

        public void initMethod() {
            System.err.println("testBean's initMethod");
        }
    }
}
