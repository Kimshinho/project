package com.project.basicit.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConmmonController {

    @RequestMapping("/")
    public String Start(Model model) {

        return "hi";
    };
}
