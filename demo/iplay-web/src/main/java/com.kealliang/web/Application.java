package com.kealliang.web;

import com.kealliang.entity.Person;
import com.kealliang.february.dto.People;
import com.kealliang.utils.GeneratePeople;
import com.meicloud.sahara.boot.HrmsApplication;
import com.meicloud.sahara.boot.HrmsBootUtil;
import com.meicloud.sahara.core.logger.LogbackUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.MultipartConfigElement;
import java.util.List;

/**
 * @author lsr
 * @Date 2018-08-02
 * @Desc 启动类
 */
@SpringBootApplication
@ImportResource("classpath*:META-INF/conf/spring/*.xml")
@RequestMapping("root")
@RestController
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

    @GetMapping("peoples")
    public List<Person> generatePeoples() {
        return GeneratePeople.makeData(100);
    }

}
