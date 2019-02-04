package id.ac.tazkia.management.assetmanagement.assetmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/list")
    public void userlist(){
    }

    @GetMapping("/user/form")
    public void formlist(){
    }
}
