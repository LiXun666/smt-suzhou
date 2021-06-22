package com.xd.zt.controller.wgltest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:lx
 * @Date: 2021/6/16 11:05
 * @Description:
 */
@Controller
//@RequestMapping("/webgl")
public class WebglController {
    @RequestMapping("/home")
    public String home(){

        return "home";
    }

    @RequestMapping("/login")
    public String login(){

        return "login";
    }
    @RequestMapping("/integrationindex")
    public String index(){
        return "integration/index";
    }

    @RequestMapping("/newPageindex")
    public String index2(){

        return "newPage/index";
    }

    @RequestMapping("/newFlowindex")
    public String index3(){

        return "newFlow/newflowPage";
    }
}
