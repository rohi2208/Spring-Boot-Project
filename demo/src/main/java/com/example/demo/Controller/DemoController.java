package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class DemoController{

    @GetMapping(path="${id}")
  public String getHello()
  {
    return "hello World";
  }  
}