package com.example.cleanblog.controller.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/admin")
    private String admin(){
        return "/dashboard/index.html";
    }
}
