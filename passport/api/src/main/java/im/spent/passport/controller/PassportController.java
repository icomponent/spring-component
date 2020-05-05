package im.spent.passport.controller;

import im.spent.passport.transfer.CommonLoginCredentials;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassportController {

    @PostMapping("login")
    public void login(@RequestBody CommonLoginCredentials credentials) {
    }
}
