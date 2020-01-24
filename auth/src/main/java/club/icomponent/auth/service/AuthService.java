package club.icomponent.auth.service;

import club.icomponent.common.transfer.auth.TraditionalUser;

public interface AuthService {

    String login(TraditionalUser user);
}
