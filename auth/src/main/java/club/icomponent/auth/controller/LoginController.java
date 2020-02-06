package club.icomponent.auth.controller;

import club.icomponent.auth.service.AuthService;
import club.icomponent.common.transfer.auth.AuthToken;
import club.icomponent.common.transfer.auth.CommonCredentials;
import club.icomponent.core.util.ValidationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    private final AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("login")
    public AuthToken login(@RequestBody CommonCredentials credentials) {
        logger.debug("校验数据");
        ValidationUtils.validate(credentials);

        logger.debug("登录");
        return authService.login(credentials.getUsername(), credentials.getPassword());
    }
}
