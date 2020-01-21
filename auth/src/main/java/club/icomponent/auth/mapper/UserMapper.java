package club.icomponent.auth.mapper;

import club.icomponent.common.auth.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectUserByUsername(String username);
}
