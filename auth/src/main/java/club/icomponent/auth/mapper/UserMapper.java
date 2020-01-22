package club.icomponent.auth.mapper;

import club.icomponent.common.auth.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name, username, password) VALUES (#{name}, #{username}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);

    @Select("SELECT * FROM user WHERE username=#{username}")
    User selectUserByUsername(String username);
}
