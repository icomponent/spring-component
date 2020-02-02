package club.icomponent.auth.controller;

import club.icomponent.auth.service.AuthService;
import club.icomponent.common.transfer.auth.AuthToken;
import club.icomponent.common.transfer.auth.CommonCredentials;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("login")
    public AuthToken login(@RequestBody CommonCredentials credentials) {
        return authService.login(credentials);
    }
}
