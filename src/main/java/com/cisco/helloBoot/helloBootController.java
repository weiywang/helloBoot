package com.cisco.helloBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class helloBootController {
    @Value("${program.author}")
    private String programAuthor;
    @Value("${program.name}")
    private  String programName;
    @RequestMapping("/")
    String index(){
        return "Program name is:"+programName+" and program author is:"+programAuthor;
    }

    public static void main(String[] args){
        SpringApplication.run(helloBootController.class,args);
    }
}
