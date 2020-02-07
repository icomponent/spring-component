package club.icomponent.auth.mapper;

import club.icomponent.common.data.auth.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(username, password) VALUES(#{username}, #{password})")
    void insert(User user);

    @Select("SELECT EXISTS(SELECT temp FROM user WHERE username=#{username})")
    Boolean existsUserByUsername(String username);

    @Select("SELECT * FROM user WHERE username=#{username}")
    Optional<User> selectUserByUsername(String username);
}
