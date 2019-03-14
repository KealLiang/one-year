package com.kealliang.web;

import com.kealliang.service.PropagationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsr
 * @ClassName TransactionController
 * @Date 2019-03-14
 * @Desc 事务controller
 * @Vertion 1.0
 */
@RestController
@RequestMapping("propa")
public class TransactionController {

    @Autowired
    private PropagationService propagationService;

    @RequestMapping("aa")
    public void aa() {
        propagationService.aa();
    }

    @RequestMapping("bb")
    public void bb() {
        propagationService.bb();
    }
}
