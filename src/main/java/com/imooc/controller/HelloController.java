package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaolinzi on 2017/11/6.
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/say" ,method = RequestMethod.GET)
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id: " + id;
    }
}
