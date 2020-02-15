package com.kealliang.web;

import com.meicloud.sahara.web.HrmsController;
import com.kealliang.constant.EnumType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsr
 * @ClassName EnumDemoController
 * @Date 2020-02-04
 * @Desc
 * @Vertion 1.0
 */
@RestController
@RequestMapping("user")
public class EnumDemoController extends HrmsController {

    @GetMapping("enum/demo")
    public String enumDemo(){
        return EnumType.MORNING.getCode() + "---" + EnumType.MORNING.getName();
    }
}
