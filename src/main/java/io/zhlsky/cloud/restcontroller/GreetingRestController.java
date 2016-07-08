package io.zhlsky.cloud.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetingRestController {
    
    @Value("${greeting}")
    String greeting;

    @RequestMapping("/")
    public String greeter() {
        return greeting;
    }
}
