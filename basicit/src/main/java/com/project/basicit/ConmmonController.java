package com.project.basicit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConmmonController {

    @RequestMapping("/")
    public String Start() {

        return "start";
    };
}
