package com.musician.awselasticbeanstalk_example;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/hello")
         @RestController
public class HelloController {

     public String hello(){
         return "Hello Musician";
     }
}
