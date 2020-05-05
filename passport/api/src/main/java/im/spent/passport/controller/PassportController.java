package im.spent.passport.controller;

import im.spent.passport.transfer.CommonLoginCredentials;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "通行证", tags = "通行证")
@RestController
@RequestMapping("passport")
public class PassportController {

    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @PostMapping("login")
    public void login(@ApiParam(name = "普通登录凭证", value = "普通登录凭证", required = true) @RequestBody CommonLoginCredentials credentials) {
    }
}
