package com.kealliang.web;

import com.meicloud.sahara.boot.HrmsApplication;
import com.meicloud.sahara.boot.HrmsBootUtil;
import com.meicloud.sahara.core.logger.LogbackUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.MultipartConfigElement;

/**
 * @author lsr
 * @Date 2018-08-02
 * @Desc 启动类
 */
@SpringBootApplication
@ImportResource("classpath*:META-INF/conf/spring/*.xml")
public class Application extends HrmsApplication {

    public static void main(String[] args) {
        LogbackUtils.initLogbackPropertyDefiner(args);
        SpringApplication application = new SpringApplication(new Object[] { Application.class });
        HrmsBootUtil.addInitializers(application, args);
        application.run(args);
    }

    /**
     * 设置传输最大文件大小
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大
        factory.setMaxFileSize("20MB"); //KB,MB
        //设置总上传数据总大小
        factory.setMaxRequestSize("20MB");
        return factory.createMultipartConfig();
    }

}
