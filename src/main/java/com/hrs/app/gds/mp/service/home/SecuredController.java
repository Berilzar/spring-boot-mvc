package com.hrs.app.gds.mp.service.home;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecuredController {

    @Secured("ADMIN")
    @GetMapping("users")
    public String homePageView() {
        return "secured";
    }

    @GetMapping("secured")
    public String securedPageView() {
        return "secured";
    }

}
