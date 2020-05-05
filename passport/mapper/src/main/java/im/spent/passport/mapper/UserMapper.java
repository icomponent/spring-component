package im.spent.passport.mapper;

import im.spent.passport.CoreMapper;
import im.spent.passport.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends CoreMapper<User> {
}
