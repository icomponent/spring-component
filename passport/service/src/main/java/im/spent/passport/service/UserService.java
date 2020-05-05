package im.spent.passport.service;

import im.spent.passport.common.User;

public interface UserService {

    User findUser(String username, String password);

    User createUser(User user);
}
