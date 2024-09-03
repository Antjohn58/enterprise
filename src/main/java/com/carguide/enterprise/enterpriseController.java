package com.carguide.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class enterpriseController {
    @RequestMapping("/")
    public String index()
    {
        return "first";
    }
}
