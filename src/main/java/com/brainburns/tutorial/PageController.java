package com.brainburns.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by arthan on 21.05.2017. | Project tutorial
 */

@Controller
public class PageController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }
}
