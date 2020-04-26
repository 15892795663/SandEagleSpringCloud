package org.sandeagle.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description: TODO
 * @Company:北京九恒星科技股份有限公司
 * @Author xiaolong
 * @Date 2020/4/26
 **/

@RestController
public class TestController {

    @RequestMapping("test/hello")
    public String helloWorld(){
        return "helloWorld";
    }
}
