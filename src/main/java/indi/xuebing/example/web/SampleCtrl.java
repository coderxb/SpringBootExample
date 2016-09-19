package indi.xuebing.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleCtrl {

    @RequestMapping("/hello")
    @ResponseBody
    String helloWorld() {
        return "Hello World!";
    }

}
