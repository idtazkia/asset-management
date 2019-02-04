package id.ac.tazkia.management.assetmanagement.assetmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GedungController {

    @GetMapping("/gedung/list")
    public void gedunglist(){
    }

    @GetMapping("gedung/form")
    public void gedungform(){
    }
}
