package com.kealliang.web;

import com.kealliang.service.LockDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsr
 * @ClassName LockDemoController
 * @Date 2019-01-18
 * @Desc 锁demo
 * @Vertion 1.0
 */
@RestController
@RequestMapping("demo")
public class LockDemoController {

    @Autowired
    private LockDemoService lockDemoService;


    @GetMapping("forward")
    public void forwardUpdate(){
        lockDemoService.forwardUpdate();
    }

    @GetMapping("backward")
    public void backwardUpdate(){
        lockDemoService.backwardUpdate();
    }

    @GetMapping("{id}/gapTest")
    public void gapTest(@PathVariable Integer id){
        lockDemoService.gapTest(id);
    }

    @GetMapping("gapTest2")
    public void gapTest2() {
        lockDemoService.gapTest2();
    }

    @GetMapping("impossible")
    public void impossible() {
        lockDemoService.impossible();
    }






    @GetMapping("initData")
    public void initData() {
        lockDemoService.initData();
    }
}
