package com.example.hackncrawl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mapping {

    @RequestMapping("/Join_Game")
    public String lobby(){
        return "lobby";
    }

    @RequestMapping("/Settings")
    public String settings(){
        return "settings";
    }
}
