package id.ac.tazkia.management.assetmanagement.assetmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TanahController {

    @GetMapping("/tanah/list")
    public void tanahlist(){
    }

    @GetMapping("/tanah/form")
    public void tanahform(){
    }
}
