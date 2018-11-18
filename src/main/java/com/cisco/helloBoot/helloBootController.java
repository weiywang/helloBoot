package com.cisco.helloBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.helloBoot.config.AuthorSettings;

@RestController
@SpringBootApplication
public class helloBootController {
    @Autowired
    private AuthorSettings authorSettings;
    @RequestMapping("/")

    String index(){
        return "author name is:"+authorSettings.getName()+" and author age is:"+authorSettings.getAge();
    }

    public static void main(String[] args){
        SpringApplication.run(helloBootController.class,args);
    }
}
