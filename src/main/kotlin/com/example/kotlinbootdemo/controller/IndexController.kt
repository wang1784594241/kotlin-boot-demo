package com.example.kotlinbootdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by Administrator on 2017/11/24.
 */
@Controller
class IndexController {

    @RequestMapping(value = *arrayOf("/", "/index"))
    fun index(): String {
        println("111")
        return "/index"
    }
}
