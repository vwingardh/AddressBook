package com.addressBook.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/detailed-address")
    public String detailedAddress() {
        return "add_address.html";
    }
}
