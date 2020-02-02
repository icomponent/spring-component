package club.icomponent.auth.mapper;

import club.icomponent.common.data.auth.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE username=#{username}")
    Optional<User> selectUserByUsername(String username);
}
