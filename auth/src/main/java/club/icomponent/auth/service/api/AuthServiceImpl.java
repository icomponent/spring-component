package club.icomponent.auth.service.api;

import club.icomponent.auth.service.AuthService;
import club.icomponent.common.transfer.auth.AuthToken;
import club.icomponent.common.transfer.auth.CommonCredentials;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthToken login(CommonCredentials credentials) {
        return null;
    }
}
