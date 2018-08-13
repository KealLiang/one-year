package com.kealliang.february.web;

import com.kealliang.february.service.DemoService;
import com.meicloud.sahara.web.HrmsController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lsr
 * @Date 2018-08-02
 * @Desc 示例controller
 */
@RestController
@RequestMapping("/demo")
public class DemoController extends HrmsController {

    @Autowired
    private DemoService demoService;

    /**
     * 打印当前线程
     * @return
     */
    @GetMapping("test")
    public String testMethod() {
        demoService.printCurrentThread();
        return "hehe";
    }

    /**
     * 当前时间
     * @return
     */
    @GetMapping("printNowDate")
    public String getNowDate(){
        return demoService.printNowDate().toString();
    }

    /**
     * 并发更新实验
     * 同时压cu与cu2即可出现死锁
     * -n 200 -c 5
     * @return
     */
    @GetMapping("cu")
    public String concurrentMethod() {
        demoService.concurrentUpdate();
        return "cu";
    }

    /**
     * 并发更新实验
     * 压cu与cu2即可出现死锁
     * @return
     */
    @GetMapping("cu2")
    public String concurrentMethod2() {
        demoService.concurrentUpdate2();
        return "cu2";
    }

    /**
     * 并发访问实验1
     * @return
     */
    @GetMapping("ce")
    public String exprimentMethod() {
        demoService.concurrentExperiment();
        return "ce";
    }

    /**
     * 并发访问实验2
     * 先访问 ce2 再访问 ce 等待 即可抛出MySQLTransactionRollbackException
     * com.mysql.cj.jdbc.exceptions.MySQLTransactionRollbackException: Lock wait timeout exceeded; try restarting transaction
     * @return
     */
    @GetMapping("ce2")
    public String exprimentMethod2() {
        demoService.concurrentExperitment2();
        return "ce2";
    }

    /**
     * gap lock
     * @return
     */
    @GetMapping("gl")
    public String gapLock(){
        demoService.gapLock();
        return "gl";
    }

    /**
     * gap lock
     * @return
     */
    @GetMapping("gl2")
    public String gapLock2(){
        demoService.gapLock2();
        return "gl2";
    }


}
