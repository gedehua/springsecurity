package com.gedehua.Mapper;

import com.gedehua.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.Mapping;

/**
 * @author gedehua666
 */
@Mapper
public interface UserMapper {
    /**
     *
     * @param id id
     * @return User
     */
    User selectAllById(@Param("id") long id);

    /**
     *
     * @param username
     * @return user
     */
    User selectAllByUsername(@Param("username") String username);
}
