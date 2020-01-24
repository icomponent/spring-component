package club.icomponent.auth.controller;

import club.icomponent.auth.service.AuthService;
import club.icomponent.common.transfer.auth.TraditionalUser;
import club.icomponent.core.util.ValidationUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("login")
    public String login(@RequestBody TraditionalUser user) {
        ValidationUtils.validate(user);
        return this.authService.login(user);
    }
}
