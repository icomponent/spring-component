package im.spent.passport.transfer;

import im.spent.core.exception.InvalidArgumentException;
import im.spent.core.validate.Validatable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 普通登录凭证
 */
@ApiModel(value = "普通登录凭证")
public class CommonLoginCredentials implements Validatable {

    /**
     * 账户
     */
    @ApiModelProperty(value = "账户", required = true)
    private String account;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    public CommonLoginCredentials() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void checkValid() throws InvalidArgumentException {
    }
}
