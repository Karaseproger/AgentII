package com.II.AgentII.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class agentController {
    @GetMapping("/")
    public String agent(Model model){
        return "agent";
    }

    @GetMapping("/log")
    public String loh(Model model){
        return "loh";
    }

}
