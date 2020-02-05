package club.icomponent.auth.controller;

import club.icomponent.common.transfer.auth.register.RegisterInformation;
import club.icomponent.core.util.ValidationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RegisterController {

    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @PostMapping("register")
    public void register(@RequestBody RegisterInformation information) {
        logger.debug("校验数据");
        ValidationUtils.validate(information);
    }
}
