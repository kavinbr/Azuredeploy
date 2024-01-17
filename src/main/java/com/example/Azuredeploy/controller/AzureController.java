package com.example.Azuredeploy.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/kec")
public class AzureController {
    @GetMapping("/msc2")
    public String kec() {
        return "welcome to kec - kavin you are legend..";
    }
}
