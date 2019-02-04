package id.ac.tazkia.management.assetmanagement.assetmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KendaraanController {

    @GetMapping("/kendaraan/list")
    public void kendaraanlist(){
    }

    @GetMapping("/kendaraan/form")
    public void kendaraanform(){
    }
}
