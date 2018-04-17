package com.hrs.app.gds.mp.service.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", ""})
    public String homePageView() {
        return "index";
    }

}
