package im.spent.passport.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassportController {

    @RequestMapping
    public String index() {
        return "Hello World!";
    }
}
